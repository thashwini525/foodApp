package com.spl.foodApplication.service;

import com.spl.foodApplication.dto.RatingDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Rating;
import org.springframework.http.ResponseEntity;

public interface RatingService {
    public ResponseEntity<ResponseStructure<Rating>> createRating(RatingDto ratingDto);


}
