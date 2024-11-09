package com.spl.foodApplication.dto;

import lombok.Data;

@Data
public class ResponseStructure<T> {
    private int statusCode;
    private String Message;
    private T Data;
}
