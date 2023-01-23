package com.example.springboot_daohibernate.repository;

import com.example.springboot_daohibernate.model.Person;

import java.util.List;

interface PersonRepository {
    List <Person> getPersonsByCity(String city);
}
