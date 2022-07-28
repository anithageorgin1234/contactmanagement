package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User  findByUsernameAndPassword(String username,String Password);
	
	//select * from user where username=? and password=?

}
