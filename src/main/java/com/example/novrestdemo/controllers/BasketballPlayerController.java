package com.example.novrestdemo.controllers;

import com.example.novrestdemo.models.BasketballPlayer;
import com.example.novrestdemo.repos.BasketBallPlayerRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BasketballPlayerController {
    @Resource
    BasketBallPlayerRepo ballRepo;

    @GetMapping("/BasketBallPlayers")
    public Iterable<BasketballPlayer> getAllPlayers(){
        return ballRepo.findAll();
    }

}
