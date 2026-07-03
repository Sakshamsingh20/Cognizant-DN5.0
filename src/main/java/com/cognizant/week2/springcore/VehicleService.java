package com.cognizant.week2.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private Vehicle vehicle;

    public void showVehicleDetails() {
        vehicle.display();
    }
}