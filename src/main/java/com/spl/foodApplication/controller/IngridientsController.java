package com.spl.foodApplication.controller;

import com.spl.foodApplication.dto.IngridientsDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Ingridient;
import com.spl.foodApplication.service.IngridientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngridientsController {
    @Autowired
    private IngridientService ingridientService;

    @PostMapping("/saveIngridient")
    public ResponseEntity<ResponseStructure<Ingridient>> saveIngridient(IngridientsDto ingridientsDto){
        return ingridientService.saveIngridient(ingridientsDto);
    }

}
