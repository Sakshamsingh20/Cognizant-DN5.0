package com.cognizant.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    ProductRepository repository; // fake repository

    @InjectMocks
    ProductService productService; // real service with fake repo injected

    @Test
    public void testGetProductName() {
        // Stubbing - tell mock what to return
        when(repository.findById(1)).thenReturn("Laptop");

        // Act
        String result = productService.getProductName(1);

        // Assert
        assertEquals("Laptop", result);
        System.out.println("Product name: " + result);
    }

    @Test
    public void testGetProductPrice() {
        // Stubbing
        when(repository.getPriceById(1)).thenReturn(999.99);

        // Act
        double price = productService.getProductPrice(1);

        // Assert
        assertEquals(999.99, price);
        System.out.println("Product price: " + price);
    }
}