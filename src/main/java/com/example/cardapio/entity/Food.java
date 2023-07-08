package com.example.cardapio.entity;

import com.example.cardapio.DTO.FoodResquestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodResquestDTO dto){
        this.image = dto.getImageFood();
        this.price = dto.getPriceFood();
        this.title = dto.getTitleFood();
    }
}
