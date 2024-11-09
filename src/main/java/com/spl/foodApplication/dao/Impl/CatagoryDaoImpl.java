package com.spl.foodApplication.dao.Impl;

import com.spl.foodApplication.dao.CatagoryDao;
import com.spl.foodApplication.dto.CatagoryDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Catagory;
import com.spl.foodApplication.repository.CatagoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class CatagoryDaoImpl  implements CatagoryDao {
    @Autowired
    private CatagoryRepository catagoryRepository;

    @Override
    public Catagory categorySave(Catagory catagory) {
        return catagoryRepository.save(catagory);
    }
}
