package com.spl.foodApplication.service.Impl;

import com.spl.foodApplication.dao.IngridientsDao;
import com.spl.foodApplication.dto.IngridientsDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Ingridient;
import com.spl.foodApplication.service.IngridientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class IngridientsServiceImpl implements IngridientService {
    @Autowired
    private IngridientsDao ingridientsDao;
    @Override
    public ResponseEntity<ResponseStructure<Ingridient>> saveIngridient(IngridientsDto ingridientsDto) {
        Ingridient ingridient = new Ingridient();
        ingridient.setName(ingridientsDto.getName());
        ingridient.setUnit(ingridientsDto.getUnit());
        ingridient.setPrice(ingridientsDto.getPrice());
        ingridient.setQuantity(ingridientsDto.getQuantity());

        Ingridient ingridient1 = ingridientsDao.saveIngridientDao(ingridient);

        ResponseStructure responseStructure = new ResponseStructure();
        responseStructure.setStatusCode(HttpStatus.CREATED.value());
        responseStructure.setMessage("Ingrediant added");
        responseStructure.setData(ingridient1);

        return new ResponseEntity<ResponseStructure<Ingridient>>(responseStructure, HttpStatus.CREATED);
    }
}
