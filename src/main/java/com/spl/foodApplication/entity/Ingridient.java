package com.spl.foodApplication.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ingridient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name;
    private double quantity;
    private double unit;
    private int price;
}
