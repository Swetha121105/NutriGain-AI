package com.nutrigain.controller;

import com.nutrigain.model.User;
import com.nutrigain.repository.UserRepository;
import com.nutrigain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
    @GetMapping("/bmi")
public double calculateBMI(
        @RequestParam double weight,
        @RequestParam double height) {

    return weight / (height * height);
}
@Autowired
private UserRepository repository;
@PostMapping("/login")
public String login(@RequestBody User user) {

    User dbUser = repository.findByEmail(user.getEmail())
            .orElse(null);

    if(dbUser == null) {
        return "User not found";
    }

    if(dbUser.getPassword().equals(user.getPassword())) {
        return "Login Successful";
    }

    return "Invalid Password";
}


}