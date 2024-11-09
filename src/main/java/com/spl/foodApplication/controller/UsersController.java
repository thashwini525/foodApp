package com.spl.foodApplication.controller;

import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.dto.UsersDto;
import com.spl.foodApplication.entity.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @PostMapping("/save")
    public ResponseEntity<ResponseStructure<Users>> saveUsers(@RequestBody UsersDto usersDto) {

    }
}
