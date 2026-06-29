package com.cognizant.mockito;

public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public String getProductName(int id) {
        return repository.findById(id);
    }

    public double getProductPrice(int id) {
        return repository.getPriceById(id);
    }
}