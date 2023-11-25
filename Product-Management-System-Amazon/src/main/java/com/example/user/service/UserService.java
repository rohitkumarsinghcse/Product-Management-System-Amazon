package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.entity.UserDetails;
import com.example.user.repository.UserRepository;
import com.example.user.request.UserAccountRequest;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public String signUpAccount(UserAccountRequest request) {

		UserDetails userDetails = new UserDetails();
		userDetails.setUserName(request.getUserName());
		userDetails.setFirstName(request.getFirstName());
		userDetails.setLastname(request.getLastName());
		userDetails.setEmail(request.getEmail());
		userDetails.setPassword(request.getPassword());
		userDetails.setAddress(request.getAddress());

		UserDetails save = repository.save(userDetails);
		if (save != null) {
			return save.getFirstName()+"   User Registration Done Sucessfully ...........";
		} else {
			return "Somthing Went Worng !!!!!!!!!!!!!!";
		}
	}

}
