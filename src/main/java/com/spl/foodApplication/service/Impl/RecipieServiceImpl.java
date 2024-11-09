package com.spl.foodApplication.service.Impl;

import com.spl.foodApplication.dao.RecipieDao;
import com.spl.foodApplication.dao.UsersDao;
import com.spl.foodApplication.dto.RecipieDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Recipie;
import com.spl.foodApplication.entity.Users;
import com.spl.foodApplication.service.RecipieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipieServiceImpl implements RecipieService {
    @Autowired
    public RecipieDao recipieDao;
    @Autowired
    public UsersDao usersDao;

    @Override
    public ResponseEntity<ResponseStructure<Recipie>> addReceipe(RecipieDto receipedto, int usersId) {
        Users foundUser = usersDao.fetchById(usersId);
        Recipie recipie =new Recipie();

        recipie.setTitle(receipedto.getTitle());
        recipie.setDescription(receipedto.getDescription());
        recipie.setSteps(receipedto.getSteps());
        recipie.setUser(foundUser);
        List<Recipie> list=foundUser.getRecipie();
        if(list!=null) {
            list.add(recipie);
            usersDao.savsUsers(foundUser);
        }else {
            list=new ArrayList<>();
            list.add(recipie);
            usersDao.savsUsers(foundUser);
        }
        ResponseStructure<Recipie> responseStructure=new ResponseStructure();
        responseStructure.setStatusCode(HttpStatus.CREATED.value());
        responseStructure.setMessage("OK");
        responseStructure.setData(recipieDao.addReceipe(recipie));
        return new ResponseEntity<>(responseStructure,HttpStatus.CREATED);
    }
}