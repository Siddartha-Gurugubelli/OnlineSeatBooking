package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue
	private int adminId;
	private String adminName;
	private String email;
	private String password;
	
	//@OneToMany
	//private Location location;
	//	@OneToMany
	//private Seat seat;
	//@OneToMany
	//private Office office;
	//@OneToMany
	//private User user;
	public Admin() {
		
	}
	
	
	public Admin(String adminName, String email, String password) {
		super();
		this.adminName = adminName;
		this.email = email;
		this.password = password;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
