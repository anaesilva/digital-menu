package com.example.cardapio.controller;

import com.example.cardapio.DTO.FoodResponseDTO;
import com.example.cardapio.DTO.FoodResquestDTO;
import com.example.cardapio.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodService service;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foodList = service.getAllFoods();
        return foodList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodResquestDTO data) {
        service.saveFood(data);
    }
}
