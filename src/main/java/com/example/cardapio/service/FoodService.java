package com.example.cardapio.service;

import com.example.cardapio.DTO.FoodResponseDTO;
import com.example.cardapio.DTO.FoodResquestDTO;
import com.example.cardapio.entity.Food;
import com.example.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository repository;

    public List<FoodResponseDTO> getAllFoods() {
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

    public void saveFood(FoodResquestDTO data) {
        Food foodData = new Food(data);
        repository.save(foodData);
    }
}
