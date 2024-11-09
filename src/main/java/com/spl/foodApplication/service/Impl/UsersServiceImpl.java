package com.spl.foodApplication.service.Impl;

import com.spl.foodApplication.dao.UsersDao;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.dto.UsersDto;
import com.spl.foodApplication.entity.Users;
import com.spl.foodApplication.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class UsersServiceImpl implements UsersService {
    private UsersDao usersDao;
    @Override
    public ResponseEntity<ResponseStructure<Users>> saveUsers(UsersDto usersDto) {
return null;
    }
}
