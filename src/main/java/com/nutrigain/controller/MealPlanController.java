package com.nutrigain.controller;

import com.nutrigain.model.MealPlan;
import com.nutrigain.repository.MealPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meals")
public class MealPlanController {

    @Autowired
    private MealPlanRepository repository;

    @PostMapping
    public MealPlan addMeal(@RequestBody MealPlan mealPlan) {
        return repository.save(mealPlan);
    }

    @GetMapping
    public List<MealPlan> getAllMeals() {
        return repository.findAll();
    }
}
