package com.example.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userdpt.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
