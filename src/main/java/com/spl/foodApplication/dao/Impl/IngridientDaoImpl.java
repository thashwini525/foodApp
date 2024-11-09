package com.spl.foodApplication.dao.Impl;

import com.spl.foodApplication.dao.IngridientsDao;
import com.spl.foodApplication.entity.Ingridient;
import com.spl.foodApplication.repository.IngridientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IngridientDaoImpl implements IngridientsDao {
    @Autowired
    private IngridientRepository ingridientRepository;

    @Override
    public Ingridient saveIngridientDao(Ingridient ingridient) {
        return ingridientRepository.save(ingridient);
    }
}
