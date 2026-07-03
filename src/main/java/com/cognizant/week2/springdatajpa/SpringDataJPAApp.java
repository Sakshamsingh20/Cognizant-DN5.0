package com.cognizant.week2.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJPAApp {

    public static void main(String[] args) {
        ApplicationContext context = 
            SpringApplication.run(SpringDataJPAApp.class, args);

        StudentRepository repo = context.getBean(StudentRepository.class);

        // Save students
        repo.save(new Student("Saksham", "saksham@email.com"));
        repo.save(new Student("Rahul", "rahul@email.com"));
        repo.save(new Student("Priya", "priya@email.com"));

        System.out.println("=== All Students in Database ===");
        repo.findAll().forEach(System.out::println);

        System.out.println("Total students: " + repo.count());
        System.out.println("Spring Data JPA working successfully!");
    }
}