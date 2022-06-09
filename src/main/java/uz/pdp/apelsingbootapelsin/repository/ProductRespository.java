package uz.pdp.apelsingbootapelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apelsingbootapelsin.entity.Category;
import uz.pdp.apelsingbootapelsin.entity.Product;

public interface ProductRespository extends JpaRepository<Product,Integer> {
    //negative query - sql
    //
}
