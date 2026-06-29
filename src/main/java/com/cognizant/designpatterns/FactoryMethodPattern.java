package com.cognizant.designpatterns;

public class FactoryMethodPattern {

    // Step 1: Common interface for all vehicles
    interface Vehicle {
        void create();
    }

    // Step 2: Different vehicle types
    static class Car implements Vehicle {
        public void create() {
            System.out.println("Car is created!");
        }
    }

    static class Bike implements Vehicle {
        public void create() {
            System.out.println("Bike is created!");
        }
    }
    
    static class Truck implements Vehicle {
    	public void create() {
    		System.out.println("Truck is created");
    	}
    }

    // Step 3: Factory class - decides which object to create
     static class VehicleFactory{

         public static Vehicle getVehicle(String type) {
         if (type.equalsIgnoreCase("CAR")) {
             return new Car();
         } else if (type.equalsIgnoreCase("BIKE")) {
             return new Bike();
         } else if (type.equalsIgnoreCase("TRUCK")) {
             return new Truck();
         }
         return null;
     }
     }
    	 
     
   

    public static void main(String[] args) {
        // We just ask Factory - we don't create object ourselves!
        Vehicle v1 = VehicleFactory.getVehicle("CAR");
        v1.create();
        
        Vehicle v2 = VehicleFactory.getVehicle("Bike");
        v2.create();
        
        Vehicle v3 = VehicleFactory.getVehicle("Truck");
        v3.create();

        
    }
}