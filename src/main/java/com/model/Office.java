package com.model;

import javax.persistence.*;

@Entity
public class Office {
	
	@Id
	@GeneratedValue
	private int offId;
	private String offName;
	private int floorNo;
	private int roomNo;
	public Office() {
		
	}
	public Office(String offName, int floorNo, int roomNo) {
		super();
		this.offName = offName;
		this.floorNo = floorNo;
		this.roomNo = roomNo;
	}
	public int getOffId() {
		return offId;
	}
	public void setOffId(int offId) {
		this.offId = offId;
	}
	public String getOffName() {
		return offName;
	}
	public void setOffName(String offName) {
		this.offName = offName;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	
}
