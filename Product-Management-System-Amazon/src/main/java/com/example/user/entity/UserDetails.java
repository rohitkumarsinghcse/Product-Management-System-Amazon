package com.example.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Amazon_User_Details_Sign_Up")
public class UserDetails {

	@Id
	@Column
	private String userName;
	@Column
	private String firstName;
	@Column
	private String lastname;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String address;
}
