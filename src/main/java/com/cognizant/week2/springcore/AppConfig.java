package com.cognizant.week2.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.cognizant.week2.springcore")
public class AppConfig {

    @Bean
    public GreetingService greetingService() {
        return new GreetingService();
    }

    @Bean
    public Vehicle vehicle() {
        Vehicle v = new Vehicle();
        v.setBrand("Toyota");
        v.setModel("Camry");
        return v;
    }
}