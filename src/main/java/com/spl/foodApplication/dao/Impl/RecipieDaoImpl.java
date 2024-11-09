package com.spl.foodApplication.dao.Impl;

import com.spl.foodApplication.dao.RecipieDao;
import com.spl.foodApplication.entity.Recipie;
import com.spl.foodApplication.repository.RecipieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RecipieDaoImpl implements RecipieDao {
     @Autowired
    public RecipieRepository recipieRepository;
    @Override
    public Recipie addReceipe(Recipie recipie) {
        return recipieRepository.save(recipie);
    }

}
