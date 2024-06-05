package com.example.springdemo.springdemo.domain;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
    @Override
    public String getWorkout() {
        return "Do 10 jumping jacks";
    }
}
