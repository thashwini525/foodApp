package com.spl.foodApplication.service.Impl;

import com.spl.foodApplication.dao.RatingDao;
import com.spl.foodApplication.dto.RatingDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Rating;
import com.spl.foodApplication.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
private RatingDao ratingDao;

    @Override
    public ResponseEntity<ResponseStructure<Rating>> createRating(RatingDto ratingDto) {
        Rating rating=new Rating();
        rating.setScore(ratingDto.getScore());
        rating.setComments(ratingDto.getComments());
        ResponseStructure<Rating> responseStructure=new ResponseStructure<>();
        responseStructure.setData(ratingDao.saveRating(rating));
        responseStructure.setMessage("Ratings added successfully");
        responseStructure.setStatusCode(HttpStatus.CREATED.value());
        return new ResponseEntity<>(responseStructure,HttpStatus.CREATED);
    }
}
