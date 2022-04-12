package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Office;
import com.model.OfficeDAO;

@RestController
public class OfficeController {
	@Autowired
	OfficeDAO officeDAO;
	
	@PostMapping("/addoffice")
	public String addBooking(@RequestBody Office office) {
		officeDAO.save(office);
		return "Seat Successfully Booked";
	}
	@PatchMapping("/updateoffice")
	public String updateOffice(@RequestBody Office office) {
		officeDAO.save(office);
		return "SeatModified";
	}
	@DeleteMapping("/deleteoffice/{id}")
	public String deleteOffice(@PathVariable("id") int offId) {
		officeDAO.deleteById(offId);
		return "Office deleted";
	}
	

}