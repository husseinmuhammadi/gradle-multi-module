package com.example.demo.product.service;

import com.example.demo.person.api.PersonService;
import com.example.demo.person.dto.Person;
import com.example.demo.product.api.ProductService;
import com.example.demo.product.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private PersonService personService;

    @Override
    public Product save(Product product) {
        personService.save(new Person("John"));

        System.out.println("Saving product " + product.getName());
        return product;
    }
}
