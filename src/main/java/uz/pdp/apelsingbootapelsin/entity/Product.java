package uz.pdp.apelsingbootapelsin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "product")
public class Product {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //serial
    private Integer id;

    @Column(nullable = false, length = 10)
    private String name;

    @ManyToOne
    private Category category; //category_id

    @Column(length = 250)
    private String description;

    @Column(precision = 6,scale = 2)
    private Float price;

    @Column(length = 1024)
    private String photo; //photoUrl -> lokal url orqali faylni topib kelish
}
