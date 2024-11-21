package com.spl.foodApplication.repository;

import com.spl.foodApplication.entity.Recipie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipieRepository extends JpaRepository<Recipie,Integer> {
}
