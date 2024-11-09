package com.spl.foodApplication.exception;

import com.spl.foodApplication.dto.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandller {
    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<ResponseStructure<String>> DataNotFoundExceptionHandler(DataNotFoundException dataNotFoundException){
        ResponseStructure<String> responseStructure = new ResponseStructure<>();
        responseStructure.setMessage("Data not found");
        responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
        responseStructure.setData(dataNotFoundException.getMessage());
        return new ResponseEntity<>(responseStructure, HttpStatus.NOT_FOUND);
    }

}
