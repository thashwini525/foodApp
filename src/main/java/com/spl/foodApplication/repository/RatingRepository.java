package com.spl.foodApplication.repository;

import com.spl.foodApplication.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating,Integer>{
}
