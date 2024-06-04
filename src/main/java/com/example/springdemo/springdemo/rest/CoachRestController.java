package com.example.springdemo.springdemo.rest;

import com.example.springdemo.springdemo.domain.Coach;
import com.example.springdemo.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachRestController {

    private Coach myCoach;

    private Util myUtil;

    //Creating a constructor for injections
    @Autowired
    public CoachRestController(Coach theCoach, Util util){
        myCoach = theCoach;
        myUtil = util;
    }

    @GetMapping("/dailyWorkout")
    public String getWorkout() {
        String utilResult = myUtil.utilMethod();
        return myCoach.getWorkout();
    }


}
