package com.example.novrestdemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rockstar extends Person implements CanPlay{
    @Id
    @GeneratedValue
    private Long id;

    public Rockstar(String name, int age) {
        super(name, age);
    }

    public Rockstar(){

    }

    @Override
    public void intro() {
        System.out.println("I am Rockstar "+getName());
    }

    public Long getId() {
        return id;
    }

    @Override
    public void playGuitar() {
        System.out.println("Eddie Ate Dynamite Good Bye Eddie!");
    }

    @Override
    public void crowdSurf() {
        System.out.println(getName()+" Jumped into the crowd!!!");
    }

    @Override
    public void goOnTour() {
        System.out.println("First stop; Berlin!");
    }
}
