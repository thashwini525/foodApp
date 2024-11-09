package com.spl.foodApplication.repository;

import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Catagory;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public interface CatagoryRepository extends JpaRepository<Catagory,Integer> {

}
