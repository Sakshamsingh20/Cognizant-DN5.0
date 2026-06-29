package com.cognizant.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    BankAccount account;

    // SETUP - runs before every test
    @BeforeEach
    public void setUp() {
        account = new BankAccount(1000.0);
        System.out.println("Setup: Account created with balance 1000");
    }

    // TEARDOWN - runs after every test
    @AfterEach
    public void tearDown() {
        account = null;
        System.out.println("Teardown: Account cleared");
    }

    @Test
    public void testDeposit() {
        // Arrange
        double depositAmount = 500.0;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(1500.0, account.getBalance());
        System.out.println("Deposit test passed!");
    }

    @Test
    public void testWithdraw() {
        // Arrange
        double withdrawAmount = 200.0;

        // Act
        account.withdraw(withdrawAmount);

        // Assert
        assertEquals(800.0, account.getBalance());
        System.out.println("Withdraw test passed!");
    }

    @Test
    public void testInsufficientFunds() {
        // Arrange
        double withdrawAmount = 2000.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(withdrawAmount);
        });
        System.out.println("Insufficient funds test passed!");
    }
}