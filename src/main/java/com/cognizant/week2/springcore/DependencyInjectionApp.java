package com.cognizant.week2.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionApp {

    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        // Spring automatically injects Vehicle into VehicleService!
        VehicleService service = context.getBean(VehicleService.class);
        service.showVehicleDetails();

        System.out.println("Dependency Injection working successfully!");
    }
}