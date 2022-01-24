package com.poc.service.metier;

import com.poc.domain.Product;
import com.poc.service.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductSMImpl implements ProductSM {

    private ProductRepository productRepository;

    public ProductSMImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(String id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot Find Product By ID: " + id));
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
