package uz.pdp.apelsingbootapelsin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import uz.pdp.apelsingbootapelsin.entity.Category;
import uz.pdp.apelsingbootapelsin.repository.CategoryRespository;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRespository categoryRespository;

    public void getAll(Model model){
        List<Category> categoryList = categoryRespository.findAll();
        model.addAttribute(categoryList);
    }
}
