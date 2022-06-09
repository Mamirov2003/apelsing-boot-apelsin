package uz.pdp.apelsingbootapelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.apelsingbootapelsin.entity.Category;

@Repository  //bu siz ham ishlaydi
public interface CategoryRespository extends JpaRepository<Category,Integer> {
    //negative query - sql
    //jpa query -> jpal
}
