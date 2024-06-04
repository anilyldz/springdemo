package com.example.springdemo.springdemo.rest;

import com.example.springdemo.springdemo.domain.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachRestController {

    private Coach myCoach;

    //Creating a constructor for injections
    @Autowired
    public CoachRestController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getWorkout() {
        return myCoach.getWorkout();
    }


}
