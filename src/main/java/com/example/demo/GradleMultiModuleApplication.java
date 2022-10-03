package com.example.demo;

import com.example.demo.product.api.ProductService;
import com.example.demo.product.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleMultiModuleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(GradleMultiModuleApplication.class, args);
    }

    @Autowired
    private ProductService productService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(productService.save(new Product("Computer")));
    }
}
