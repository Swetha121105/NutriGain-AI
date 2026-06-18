# NutriGain-AI

## Overview

NutriGain-AI is a nutrition and weight management application developed using Spring Boot and MySQL.

## Technologies Used

* Java
* Spring Boot
* MySQL
* Spring Data JPA
* Maven
* Lombok

## Features Implemented

### User Management

* User Registration
* User Login

### Health Features

* BMI Calculator
* Calorie Calculator

### Food Management

* Add Food Items
* View Food Items

### Weight Tracking

* Add Weight Logs
* View Weight History

### Meal Planning

* Create Meal Plans
* View Meal Plans

## Project Structure

backend/
├── controller/
├── model/
├── repository/
├── service/
└── resources/

## API Endpoints

### User APIs

* POST /api/users/register
* POST /api/users/login
* GET /api/users

### BMI API

* GET /api/users/bmi

### Food APIs

* POST /api/foods
* GET /api/foods

### Weight APIs

* POST /api/weights
* GET /api/weights

### Meal APIs

* POST /api/meals
* GET /api/meals

## Future Enhancements

* JWT Authentication
* Password Encryption (BCrypt)
* React Frontend
* AI Meal Recommendations
* Progress Dashboard

## Author

Swetha J
