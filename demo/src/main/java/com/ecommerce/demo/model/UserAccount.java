package com.ecommerce.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserAccount {

	@Id
	private String UserId;
	private String Password;
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
}
