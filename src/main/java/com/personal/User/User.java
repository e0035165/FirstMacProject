package com.personal.User;

import com.personal.library.MobilePhone;
import com.personal.library.Sim;

public class User {
	private MobilePhone phone;
	private Sim sim;
	private String username;
	private String password;
	public User(MobilePhone phone, Sim sim, String username, String password) {
		super();
		this.phone = phone;
		this.sim = sim;
		this.username = username;
		this.password = password;
	}
	
	
	

}
