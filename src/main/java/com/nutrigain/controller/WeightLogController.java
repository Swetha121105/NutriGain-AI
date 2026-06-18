package com.nutrigain.controller;

import com.nutrigain.model.WeightLog;
import com.nutrigain.repository.WeightLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weights")
public class WeightLogController {

    @Autowired
    private WeightLogRepository repository;

    @PostMapping
    public WeightLog save(@RequestBody WeightLog weightLog){
        return repository.save(weightLog);
    }

    @GetMapping
    public List<WeightLog> getAll(){
        return repository.findAll();
    }
}