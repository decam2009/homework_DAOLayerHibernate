package com.example.springboot_daohibernate.repository;

import com.example.springboot_daohibernate.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Person> getPersonsByCity(String city) {
        TypedQuery<Person> personTypedQuery =  entityManager.createQuery("select new list (p.name, p.surname) " +
                "from Person p where p.cityOfLiving = :cityName", Person.class);
        personTypedQuery.setParameter("cityName", city);
        return personTypedQuery.getResultList();
    }
}
