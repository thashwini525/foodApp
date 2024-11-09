package com.spl.foodApplication.dto;

import lombok.Data;

@Data
public class IngridientsDto {
    private String name;
    private double quantity;
    private double unit;
    private int price;
}
