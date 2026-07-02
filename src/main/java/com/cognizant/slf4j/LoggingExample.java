package com.cognizant.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Create logger for this class
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        // Different logging levels
        logger.error("ERROR: Database connection failed!");
        logger.warn("WARNING: Server response is slow!");
        logger.info("INFO: Application started successfully.");
        logger.debug("DEBUG: Entering main method.");

        System.out.println("-----------------------------------");

        // Real world example - Bank transaction logging
        String user = "Saksham";
        double amount = 5000.0;

        logger.info("User {} initiated a transaction of {} rupees", user, amount);

        // Simulating a warning
        if (amount > 4000) {
            logger.warn("WARNING: Large transaction detected for user {}", user);
        }

        // Simulating an error
        try {
            int result = 10 / 0; // intentional error
        } catch (Exception e) {
            logger.error("ERROR: Exception occurred - {}", e.getMessage());
        }

        logger.info("Transaction processing completed.");
    }
}