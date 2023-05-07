package com.personal.User;

import com.personal.library.MobilePhone;
import com.personal.sim.Sim;

public class User {
	private MobilePhone phone;
	private Sim sim;
	private String username;
	private String password;
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(MobilePhone phone, Sim sim, String username, String password) {
		super();
		this.phone = phone;
		this.sim = sim;
		this.username = username;
		this.password = password;
	}
	public MobilePhone getPhone() {
		return phone;
	}
	public void setPhone(MobilePhone phone) {
		this.phone = phone;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [phone=" + phone + ", sim=" + sim + ", username=" + username + ", password=" + password + ", name="
				+ name + ", address=" + address + "]";
	}
	
	
	
	

}
