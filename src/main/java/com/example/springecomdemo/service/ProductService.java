package com.example.springecomdemo.service;


import com.example.springecomdemo.model.Product;
import com.example.springecomdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();

    }

    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }
}
