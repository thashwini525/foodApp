package com.spl.foodApplication.repository;

import com.spl.foodApplication.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
