package com.spl.foodApplication.service;

import com.spl.foodApplication.dto.RecipieDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.dto.UsersDto;
import com.spl.foodApplication.entity.Recipie;
import com.spl.foodApplication.entity.Users;
import org.springframework.http.ResponseEntity;

public interface RecipieService {
    ResponseEntity<ResponseStructure<Recipie>> addReceipe(RecipieDto receipedto, int usersId);
}
