package com.spl.foodApplication.dao.Impl;

import com.spl.foodApplication.dao.UsersDao;
import com.spl.foodApplication.entity.Users;
import com.spl.foodApplication.exception.DataNotFoundException;
import com.spl.foodApplication.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Repository
public class UsersDaoImpl implements UsersDao {
@Autowired
    private UsersRepository usersRepository;
    @Override
    public Users savsUsers(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public Users fetchById(int id) {
      Optional<Users>  use  = usersRepository.findById(id);
      if(use.isPresent()) {
          return use.get();
      }
      else throw new DataNotFoundException("User with id " + id + " not found");
    }
}
