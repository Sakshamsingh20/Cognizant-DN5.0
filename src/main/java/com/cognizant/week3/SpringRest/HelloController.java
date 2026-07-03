package com.cognizant.week3.SpringRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from Spring REST!";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Cognizant Digital Nurture 5.0!";
    }
}