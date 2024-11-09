package com.spl.foodApplication.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Recipie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String title;
        private String description;
        private String steps;

    }


