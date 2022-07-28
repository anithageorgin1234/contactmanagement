package com.greatlearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.User;
import com.greatlearning.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserContoller {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/saveuser")
	public void saveUser(@RequestBody User user)
	{
		userService.save(user);
	}

}
