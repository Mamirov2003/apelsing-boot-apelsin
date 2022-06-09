package uz.pdp.apelsingbootapelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apelsingbootapelsin.entity.Category;
import uz.pdp.apelsingbootapelsin.entity.Detail;

public interface DetailRespository extends JpaRepository<Detail,Integer> {
    //negative query - sql
    //
}
