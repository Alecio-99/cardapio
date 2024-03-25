package com.proj.cardapio.DTO;

import com.proj.cardapio.entity.FoodEntity;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {

    public FoodResponseDTO(FoodEntity foodEntity){
        this(foodEntity.getId(), foodEntity.getTitle(), foodEntity.getImage(), foodEntity.getPrice());
    }
}
