package com.cognizant.week2.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Spring Data JPA automatically provides all CRUD operations!
}