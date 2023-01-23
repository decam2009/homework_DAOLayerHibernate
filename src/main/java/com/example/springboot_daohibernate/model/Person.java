package com.example.springboot_daohibernate.model;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Entity
@IdClass(PersonID.class)
@Table(name = "persons")
public class Person {

    @Id
    @Column(name = "name", nullable = false)
    private String name;
    @Id
    @Column(name = "surname", nullable = false)
    private String surname;
    @Id
    @Column(name = "age", nullable = false)
    private Integer age;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "city_of_living")
    private String cityOfLiving;
}
