package com.spl.foodApplication.repository;

import com.spl.foodApplication.entity.Ingridient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngridientRepository extends JpaRepository<Ingridient, Integer> {
}
