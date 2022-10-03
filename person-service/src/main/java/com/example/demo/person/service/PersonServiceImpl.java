package com.example.demo.person.service;

import com.example.demo.person.api.PersonService;
import com.example.demo.person.dto.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public Person save(Person person) {
        System.out.println("Saving person " + person.getName());
        return person;
    }
}
