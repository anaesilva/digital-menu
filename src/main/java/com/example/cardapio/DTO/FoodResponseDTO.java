package com.example.cardapio.DTO;

import com.example.cardapio.entity.Food;

public class FoodResponseDTO {

    private Long idFood;
    private String titleFood;
    private String imageFood;
    private Integer priceFood;

    public FoodResponseDTO(Food entity){
        this.idFood = entity.getId();
        this.titleFood = entity.getTitle();
        this.imageFood = entity.getImage();
        this.priceFood = entity.getPrice();
    }
}
