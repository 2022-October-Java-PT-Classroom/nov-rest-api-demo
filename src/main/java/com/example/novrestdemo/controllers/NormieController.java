package com.example.novrestdemo.controllers;

import com.example.novrestdemo.models.Normie;
import com.example.novrestdemo.repos.NormieRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class NormieController {

    @Resource
    NormieRepo normieRepo;

    @GetMapping("/normie/{name}")
    public Normie findNormieByName(@PathVariable String name){
        return normieRepo.findByName(name);
    }
}
