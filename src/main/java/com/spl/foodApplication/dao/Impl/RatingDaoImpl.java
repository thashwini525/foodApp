package com.spl.foodApplication.dao.Impl;

import com.spl.foodApplication.dao.RatingDao;
import com.spl.foodApplication.entity.Rating;
import com.spl.foodApplication.repository.RatingRepository;
import com.spl.foodApplication.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RatingDaoImpl implements RatingDao {
    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating saveRating(Rating rating) {
        return ratingRepository.save(rating);
    }
}
