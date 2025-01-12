package com.ordering.food.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Address {

    @id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
