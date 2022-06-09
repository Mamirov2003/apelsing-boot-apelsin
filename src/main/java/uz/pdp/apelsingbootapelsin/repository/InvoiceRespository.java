package uz.pdp.apelsingbootapelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apelsingbootapelsin.entity.Category;
import uz.pdp.apelsingbootapelsin.entity.Invoice;

public interface InvoiceRespository extends JpaRepository<Invoice,Integer> {
    //negative query - sql
    //
}
