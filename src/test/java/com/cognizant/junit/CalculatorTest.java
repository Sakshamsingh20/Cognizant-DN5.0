package com.cognizant.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);  // checks if result is 5
        System.out.println("Test Passed! 2 + 3 = " + result);
    }
}