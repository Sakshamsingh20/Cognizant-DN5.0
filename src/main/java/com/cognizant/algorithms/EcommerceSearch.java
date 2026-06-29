package com.cognizant.algorithms;

import java.util.Arrays;

public class EcommerceSearch {

    // Binary Search function - searches in a SORTED array
    public static int searchProduct(String[] products, String target) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = products[mid].compareToIgnoreCase(target);

            if (comparison == 0) {
                return mid; // Found it! Return position
            } else if (comparison < 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        String[] products = {"Charger", "Headphones", "Laptop", "Mouse", "Speaker", "Tablet"};

        // Products must be sorted for binary search to work
        Arrays.sort(products);

        String searchItem = "Laptop";
        int result = searchProduct(products, searchItem);

        if (result != -1) {
            System.out.println(searchItem + " found at index: " + result);
        } else {
            System.out.println(searchItem + " not found in the product list.");
        }

        // Try searching something that doesn't exist
        String searchItem2 = "Camera";
        int result2 = searchProduct(products, searchItem2);

        if (result2 != -1) {
            System.out.println(searchItem2 + " found at index: " + result2);
        } else {
            System.out.println(searchItem2 + " not found in the product list.");
        }
    }
}