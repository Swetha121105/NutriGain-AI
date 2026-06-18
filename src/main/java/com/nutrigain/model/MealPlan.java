package com.nutrigain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MealPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mealTime;

    private String foodName;

    private int calories;

    private double protein;

    private double carbs;

    private double fat;
}