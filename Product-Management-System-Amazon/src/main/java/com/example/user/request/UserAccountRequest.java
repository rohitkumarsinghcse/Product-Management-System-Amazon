package com.example.user.request;

import lombok.Data;

@Data
public class UserAccountRequest {

	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String address;
	
	
}
