package com.example.novrestdemo;

import com.example.novrestdemo.models.BasketballPlayer;
import com.example.novrestdemo.models.Normie;
import com.example.novrestdemo.models.Rockstar;
import com.example.novrestdemo.repos.BasketBallPlayerRepo;
import com.example.novrestdemo.repos.NormieRepo;
import com.example.novrestdemo.repos.RockstarRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {
    @Resource
    NormieRepo normieRepo;
    @Resource
    BasketBallPlayerRepo playerRepo;
    @Resource
    RockstarRepo rockstarRepo;


    @Override
    public void run(String... args) throws Exception {
        Normie personOne = new Normie("Jordan",25);
        normieRepo.save(personOne);
        BasketballPlayer personTwo = new BasketballPlayer("Lebron",40);
        playerRepo.save(personTwo);
        Rockstar personThree = new Rockstar("Robert",74);
        rockstarRepo.save(personThree);
    }
}
