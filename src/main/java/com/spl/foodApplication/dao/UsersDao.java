package com.spl.foodApplication.dao;

import com.spl.foodApplication.dto.UsersDto;
import com.spl.foodApplication.entity.Users;

public interface UsersDao {
    Users savsUsers(Users users);
    Users fetchById(int id);
}
