package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value ("${coach.name}")
    private String coachName;
    @Value ("${team.name}")
    private String teamName;

    @GetMapping("/teamInfo")
    public String getTeamInfo(){
        return "coach name : " + coachName+ ", team name : "+teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello world :)";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return " run hard 5k ";
    }

    @GetMapping("/workout2")
    public String getDailyWorkout2(){
        return " run hard 6k ";
    }
}
