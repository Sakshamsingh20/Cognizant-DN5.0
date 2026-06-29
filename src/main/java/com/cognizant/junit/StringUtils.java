package com.cognizant.junit;

public class StringUtils {

    // Check if string is empty
    public boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    // Convert to uppercase
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // Reverse a string
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Get length of string
    public int getLength(String str) {
        return str.length();
    }
}