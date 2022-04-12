package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Admin;
import com.model.AdminDAO;
import com.model.Seat;
import com.model.SeatDAO;

@RestController
public class AdminController {
	
	@Autowired
	AdminDAO adminDAO;
	@Autowired
	SeatDAO seatDAO;
	
	
	@GetMapping("/home")
	public String getHome() {
		return "Hello Admin";
	}
	@PostMapping("/addseat")
	public String addSeat(@RequestBody Seat seat) {
	seatDAO.save(seat);
	return "Seat Saved successfully";
	}
	@DeleteMapping("/deleteseat/{id}")
	public String deleteSeat(@PathVariable("id")int sId) {
		seatDAO.deleteById(sId);
		return "Seat Deleted";	
	}
	@GetMapping("findseat/{id}")
	public Optional<Seat> findSeat(@PathVariable("id")int sId){
		return seatDAO.findById(sId);
	}
	@GetMapping("/findallseats")
	public Iterable<Seat> findAllseat() {
		return seatDAO.findAll();
		 
	}
	@PostMapping("/addadmin")
	public String addAdmin(@RequestBody Admin admin) {
		adminDAO.save(admin);
		return "admin added successfully";
	}
	@DeleteMapping("/deleteadmin/{id}")
	public String deleteAdmin(@PathVariable("id") int adminId) {
		adminDAO.deleteById(adminId);
		return "admin deleted";
	}
	@DeleteMapping("/deletealladmins")
	public String deleteAllAdmins() {
		adminDAO.deleteAll();
		return "all admins deleted";
	}

}
