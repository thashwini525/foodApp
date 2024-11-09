package com.spl.foodApplication.service.Impl;

import com.spl.foodApplication.dao.CatagoryDao;
import com.spl.foodApplication.dto.CatagoryDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Catagory;
import com.spl.foodApplication.repository.CatagoryRepository;
import com.spl.foodApplication.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CatagoryServiceImpl  implements CatagoryService {
    @Autowired
  private CatagoryDao catagoryDao;
    public ResponseEntity<ResponseStructure<Catagory>> categorySave(CatagoryDto catagoryDto){
        Catagory catagory = new Catagory();
        catagory.setCategoryName(catagoryDto.getCatagoryName());
        ResponseStructure<Catagory> responseStructure = new ResponseStructure<>();
        responseStructure.setStatusCode(HttpStatus.CREATED.value());
        responseStructure.setMessage("Saved catagory");
        responseStructure.setData(catagoryDao.categorySave(catagory));
        return new ResponseEntity<>(responseStructure,HttpStatus.CREATED);
    }
}
