package com.cognizant.mockito;

public interface ProductRepository {
    String findById(int id);
    double getPriceById(int id);
}