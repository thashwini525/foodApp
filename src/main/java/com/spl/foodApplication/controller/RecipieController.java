package com.spl.foodApplication.controller;

import com.spl.foodApplication.dto.RecipieDto;
import com.spl.foodApplication.dto.ResponseStructure;
import com.spl.foodApplication.entity.Recipie;
import com.spl.foodApplication.service.RecipieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/recipes")
public class RecipieController {
        @Autowired
        private RecipieService recipieService;
        @PostMapping("/addRecipie/{UsersId}")
        
        public ResponseEntity<ResponseStructure<Recipie>> addBranch(@RequestBody RecipieDto receipiedto,@PathVariable int UsersId){
            return recipieService.addReceipe(receipiedto,UsersId);
        }


}
