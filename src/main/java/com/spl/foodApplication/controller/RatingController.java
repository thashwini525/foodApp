package com.spl.foodApplication.controller;

import com.spl.foodApplication.dto.RatingDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Rating;
import com.spl.foodApplication.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {
@Autowired
private RatingService ratingService;
    @PostMapping("/save")
    public ResponseEntity<ResponseStructure<Rating>> createRating(@RequestBody RatingDto ratingDto){
        return ratingService.createRating(ratingDto);
    }


}
