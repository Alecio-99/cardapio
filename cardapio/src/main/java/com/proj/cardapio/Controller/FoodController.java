package com.proj.cardapio.Controller;

import com.proj.cardapio.DTO.FoodResponseDTO;

import com.proj.cardapio.DTO.FoodResquestDTO;
import com.proj.cardapio.entity.FoodEntity;
import com.proj.cardapio.repository.FoodRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodResquestDTO data){
        FoodEntity foodData = new FoodEntity(data);
        repository.save(foodData);
        return;

    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public  List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
