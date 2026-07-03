package com.cognizant.week2.springcore;

public class Vehicle {
    private String brand;
    private String model;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void display() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Model: " + model);
    }
}