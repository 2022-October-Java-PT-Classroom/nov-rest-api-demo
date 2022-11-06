package com.example.novrestdemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BasketballPlayer extends Person implements CanDunk{
    @Id
    @GeneratedValue
    private Long id;

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    public BasketballPlayer(){

    }

    @Override
    public void dunkBall() {
        System.out.println(getName()+" just dunked on your eyebrows!!!");
    }

    @Override
    public void dribbleBall() {
        System.out.println(getName()+" can dribble!!!!!");
    }

    @Override
    public void shootThree() {
        if(getName().equals("Shaq")){
            System.out.println("Was in the NBA but is a terrible shot");
        }

        System.out.println(getName()+" can shoot 3s!!!!");
    }

    @Override
    public void intro() {
        System.out.println("I am Basketball Player "+getName());
    }

    public Long getId() {
        return id;
    }

}
