package com.project.study.controller;

import com.project.study.model.Product;
import com.project.study.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/product")
    public List<Product> getProduct(){
        
        return productRepository.findAll();
    }

    @RequestMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") int id){
        return productRepository.findById(id).get();
    }

}
