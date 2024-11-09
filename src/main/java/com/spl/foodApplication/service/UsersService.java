package com.spl.foodApplication.service;

import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.dto.UsersDto;
import com.spl.foodApplication.entity.Users;
import org.springframework.http.ResponseEntity;

public interface UsersService {
    ResponseEntity<ResponseStructure<Users>> saveUsers(UsersDto usersDto);
}
