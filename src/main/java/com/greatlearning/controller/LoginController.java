package com.greatlearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.User;
import com.greatlearning.service.LoginService;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/login")
	public User  getLoginUser(@RequestParam(name="uname" ) String uname,
			@RequestParam(name="password" ) String password)
	{
		 return loginService.getLoginDetails(uname, password);
		
	}

}
