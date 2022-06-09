package uz.pdp.apelsingbootapelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apelsingbootapelsin.entity.Category;
import uz.pdp.apelsingbootapelsin.entity.Order;

public interface OrderRespository extends JpaRepository<Order,Integer> {
    //negative query - sql
    //
}
