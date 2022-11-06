package com.example.novrestdemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Normie extends Person {
    @Id
    @GeneratedValue
    private Long id;

    public Normie(String name, int age) {
        super(name, age);
    }

    public Normie(){

    }

    @Override
    public void intro() {
        System.out.println("I am some regular guy!");
    }

    public Long getId(){
        return id;
    }
}
