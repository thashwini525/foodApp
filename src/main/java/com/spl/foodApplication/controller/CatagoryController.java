package com.spl.foodApplication.controller;

import com.spl.foodApplication.dto.CatagoryDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Catagory;
import com.spl.foodApplication.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catagory")
public class CatagoryController {
    @Autowired
    private CatagoryService catagoryService;

    @PostMapping("/save")
    public ResponseEntity<ResponseStructure<Catagory>> categorySave(@RequestBody CatagoryDto catagoryDto) {
     return catagoryService.categorySave(catagoryDto);
    }

}
