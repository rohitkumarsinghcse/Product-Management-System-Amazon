package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.request.UserAccountRequest;
import com.example.user.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	UserService service;

	@PostMapping(path = "/sign-up")
	public String signUpAccount(@RequestBody UserAccountRequest request) {
				
		return service.signUpAccount(request);
	}

}
