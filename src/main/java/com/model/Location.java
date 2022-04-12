package com.model;

import javax.persistence.*;

@Entity
public class Location {
	
	@Id
	@GeneratedValue
	private int locId;
	
	private int locName;
	private long zipCode;
	private String city;
	private String state;
	public int getLocId() {
		return locId;
	}
	public Location() {
		
	}
	public Location(int locName, long zipCode, String city, String state){
		super();
		this.locName = locName;
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public int getLocName() {
		return locName;
	}
	public void setLocName(int locName) {
		this.locName = locName;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
