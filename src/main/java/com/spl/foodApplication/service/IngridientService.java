package com.spl.foodApplication.service;

import com.spl.foodApplication.dto.IngridientsDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Ingridient;
import org.springframework.http.ResponseEntity;

public interface IngridientService {
    ResponseEntity<ResponseStructure<Ingridient>> saveIngridient(IngridientsDto ingridientsDto);
}
