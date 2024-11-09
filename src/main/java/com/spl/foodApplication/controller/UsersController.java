package com.spl.foodApplication.controller;

import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.dto.UsersDto;
import com.spl.foodApplication.entity.Users;
import com.spl.foodApplication.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;
    @PostMapping("/save")

    public ResponseEntity<ResponseStructure<Users>> saveUsers(@RequestBody UsersDto usersDto) {
       return usersService.saveUsers(usersDto);
    }
}
