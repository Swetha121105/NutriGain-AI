package com.nutrigain.controller;

import com.nutrigain.model.Food;
import com.nutrigain.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @PostMapping
    public Food addFood(@RequestBody Food food) {
        return repository.save(food);
    }

    @GetMapping
    public List<Food> getAllFoods() {
        return repository.findAll();
    }
}