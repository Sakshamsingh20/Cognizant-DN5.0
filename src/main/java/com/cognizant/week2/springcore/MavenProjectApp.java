package com.cognizant.week2.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MavenProjectApp {

    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        // Getting all registered beans
        System.out.println("=== Maven Project with Spring ===");
        System.out.println("Beans registered in Spring Container:");

        String[] beans = context.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println("- " + bean);
        }

        // Using our beans
        GreetingService greetingService = context.getBean(GreetingService.class);
        greetingService.greet("Maven User");

        VehicleService vehicleService = context.getBean(VehicleService.class);
        vehicleService.showVehicleDetails();

        System.out.println("=== Maven Project running successfully! ===");
    }
}