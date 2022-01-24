package com.poc.infrastructure;

import com.poc.domain.Product;
import com.poc.service.metier.ProductSM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
    @Autowired
    private ProductSM productSM;

    @GetMapping
    public List<Product> getAllProducts() {
        return productSM.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        return productSM.getProductById(id);
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productSM.saveProduct(product);
    }
}
