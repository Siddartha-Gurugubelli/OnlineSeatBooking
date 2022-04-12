package com.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	@GeneratedValue
	private int uId;
	private String userName;
	private String password;
	private String email;
	private long mobileNo;
	
	//@OneToOne
	//private Booking bId;
	
	//@OneToMany
	//private Seat sId;
	
	
	public Users() {
		
	}

	public Users(String userName, String password, String email,long mobileNo) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
