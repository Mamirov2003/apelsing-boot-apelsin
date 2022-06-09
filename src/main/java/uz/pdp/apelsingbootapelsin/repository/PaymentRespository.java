package uz.pdp.apelsingbootapelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apelsingbootapelsin.entity.Category;
import uz.pdp.apelsingbootapelsin.entity.Payment;

public interface PaymentRespository extends JpaRepository<Payment,Integer> {
    //negative query - sql
    //
}
