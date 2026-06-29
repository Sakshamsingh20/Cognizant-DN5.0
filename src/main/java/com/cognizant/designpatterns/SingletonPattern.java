package com.cognizant.designpatterns;

public class SingletonPattern {

    // Step 1: Create one private instance
    private static SingletonPattern instance = null;

    // Step 2: Make constructor private
    // (nobody can do "new SingletonPattern()")
    private SingletonPattern() {
        System.out.println("Singleton object created!");
    }

    // Step 3: Public method to get the instance
    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }

    public static void main(String[] args) {
        // Try creating two objects
        SingletonPattern obj1 = SingletonPattern.getInstance();
        SingletonPattern obj2 = SingletonPattern.getInstance();

        // Both will be the SAME object!
        System.out.println("Object 1: " + obj1);
        System.out.println("Object 2: " + obj2);

        if (obj1 == obj2) {
            System.out.println("Both are same object! Singleton works!");
        }
    }
}