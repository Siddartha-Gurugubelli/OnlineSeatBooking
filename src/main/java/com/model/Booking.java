package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue
	private int bId;
	private int bookingSeat;
	
	public Booking() {}
	
	@OneToOne
	private Seat SeatBooked;
	public Booking(int bookingSeat, Seat seatBooked) {
		super();
		this.bookingSeat = bookingSeat;
		SeatBooked = seatBooked;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public int getBookingSeat() {
		return bookingSeat;
	}
	public void setBookingSeat(int bookingSeat) {
		this.bookingSeat = bookingSeat;
	}
	public Seat getSeatBooked() {
		return SeatBooked;
	}
	public void setSeatBooked(Seat seatBooked) {
		SeatBooked = seatBooked;
	}

}
