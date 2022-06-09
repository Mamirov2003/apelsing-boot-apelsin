package uz.pdp.apelsingbootapelsin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "invoice")
public class Invoice {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //serial
    private Integer id;

    //order_id
    @OneToOne
    private Order order;

    @Column(nullable = false,precision = 8,scale = 2)
    private BigDecimal amount;

    @CreatedDate  //sistemadan vaqtni olish
    private Date issued;

    //xozir + (3) kun
    @CreatedDate  //sistemadan vaqtni olish
    private Date due;
}
