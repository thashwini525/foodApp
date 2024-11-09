package com.spl.foodApplication.dao;

import com.spl.foodApplication.dto.CatagoryDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Catagory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CatagoryDao {
    Catagory categorySave(Catagory catagory);

}
