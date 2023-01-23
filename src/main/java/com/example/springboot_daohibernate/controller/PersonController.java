package com.example.springboot_daohibernate.controller;

import com.example.springboot_daohibernate.model.Person;
import com.example.springboot_daohibernate.repository.PersonRepositoryImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    PersonRepositoryImpl repo;

    public PersonController(PersonRepositoryImpl repo) {
        this.repo = repo;
    }

    @GetMapping(value = "/persons/by-city", produces = "application/json")
    public List<Person> getPersonByCity(@RequestParam String city) {
        return repo.getPersonsByCity(city);
    }
}
