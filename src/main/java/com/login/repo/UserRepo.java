package com.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

	User findByUsername(String username);

}
