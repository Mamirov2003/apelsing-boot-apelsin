package uz.pdp.apelsingbootapelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apelsingbootapelsin.entity.Category;
import uz.pdp.apelsingbootapelsin.entity.Customer;

public interface CustomerRespository extends JpaRepository<Customer,Integer> {
    //negative query - sql
    //
}
