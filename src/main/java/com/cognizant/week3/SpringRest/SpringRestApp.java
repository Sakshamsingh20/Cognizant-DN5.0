package com.cognizant.week3.SpringRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    "com.cognizant.week3.SpringRest",
    "com.cognizant.week4.microservices.accountservice",
    "com.cognizant.week4.microservices.loanservice"
})
public class SpringRestApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringRestApp.class, args);
    }
}