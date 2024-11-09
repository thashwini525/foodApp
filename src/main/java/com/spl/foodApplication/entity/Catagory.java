package com.spl.foodApplication.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Catagory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "category_id")
    @SequenceGenerator(initialValue = 1,allocationSize = 100,name = "category_id")
    private int CategoryId;
    private String CategoryName;
    @ManyToMany
    @JoinColumn
    private List<Recipie> recipies;


}
