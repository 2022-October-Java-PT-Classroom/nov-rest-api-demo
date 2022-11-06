package com.example.novrestdemo.controllers;

import com.example.novrestdemo.models.Rockstar;
import com.example.novrestdemo.repos.BasketBallPlayerRepo;
import com.example.novrestdemo.repos.NormieRepo;
import com.example.novrestdemo.repos.RockstarRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
public class RockstarController {

    @Resource
    RockstarRepo rockstarRepo;

    @GetMapping("/rockstar/{id}")
    public Optional<Rockstar> getARockstar(@PathVariable long id){
        return rockstarRepo.findById(id);
    }
}
