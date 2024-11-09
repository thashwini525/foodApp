package com.spl.foodApplication.service;

import com.spl.foodApplication.dto.CatagoryDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Catagory;
import org.springframework.http.ResponseEntity;

public interface CatagoryService {

     ResponseEntity<ResponseStructure<Catagory>> categorySave(CatagoryDto catagoryDto);
}
