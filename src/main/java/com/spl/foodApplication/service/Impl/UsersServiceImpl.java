package com.spl.foodApplication.service.Impl;

import com.spl.foodApplication.dao.UsersDao;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.dto.UsersDto;
import com.spl.foodApplication.entity.Users;
import com.spl.foodApplication.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;
//    public UsersServiceImpl(UsersDao usersDao) {
//        this.usersDao = usersDao;
//    }

    @Override
    public ResponseEntity<ResponseStructure<Users>> saveUsers(UsersDto usersDto) {
        Users users = new Users();
      users.setName(usersDto.getName());
      users.setEmail(usersDto.getEmail());
      users.setPlace(usersDto.getPlace());
         Users users1 = usersDao.savsUsers(users);
         ResponseStructure<Users> responseStructure = new ResponseStructure<>();
         responseStructure.setData(users1);
         responseStructure.setMessage("added Users Successfully");
         responseStructure.setStatusCode(HttpStatus.CREATED.value());
         return new ResponseEntity<>(responseStructure, HttpStatus.CREATED);
    }
}
