package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.User;
import com.login.service.UserService;

@RestController
@RequestMapping("/api/login/")
public class UserController 
{
	
	@Autowired
	private UserService userService;
	
	@GetMapping("{username}/{password}")
	public String Login_page(@PathVariable String username, @PathVariable String password)
	{
		boolean r=userService.authenticate(username, password);
		if(r)
		{
			return "login done";
		}
			return "user not found";
		
	}

}
