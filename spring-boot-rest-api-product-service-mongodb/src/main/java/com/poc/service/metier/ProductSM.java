package com.poc.service.metier;

import com.poc.domain.Product;

import java.util.List;

public interface ProductSM {
    List<Product> getAllProducts();

    Product getProductById(String id);

    Product saveProduct(Product product);
}
