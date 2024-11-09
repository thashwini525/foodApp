package com.spl.foodApplication.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Recipie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String title;
        private String description;
        private String steps;

        @ManyToOne
        @JoinColumn
        private Users user;

        @OneToMany
        @JoinColumn
        private List<Ingridient> ingridient;

        @OneToMany(mappedBy = "recipie")
        private List<Rating> ratings;

        @ManyToMany
        @JoinTable(joinColumns= @JoinColumn,inverseJoinColumns = @JoinColumn)
        private List<Catagory> catagories;
    }


