package com.greatlearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.User;
import com.greatlearning.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User getLoginDetails(String username, String password) {
		// TODO Auto-generated method stub
		return userRepository.findByUsernameAndPassword(username, password);
	}

}
