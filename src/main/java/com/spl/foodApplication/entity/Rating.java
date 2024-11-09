package com.spl.foodApplication.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Rating {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private double score;
    private String comments;
    @ManyToOne
    @JoinColumn
 private Recipie recipie;
}
