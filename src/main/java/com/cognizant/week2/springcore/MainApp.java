package com.cognizant.week2.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        // Start Spring Container
        ApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

        // Get bean from Spring
        GreetingService service = context.getBean(GreetingService.class);

        // Use the bean
        service.greet("Saksham");
        service.greet("Cognizant");

        System.out.println("Spring Application running successfully!");
    }
}