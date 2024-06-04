package com.example.springdemo.springdemo.domain;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach{
    @Override
    public String getWorkout() {
        return "Run 3 KM";
    }
}
