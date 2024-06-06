package com.example.springdemo.springdemo.domain;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Swim 200 meters";
    }
}
