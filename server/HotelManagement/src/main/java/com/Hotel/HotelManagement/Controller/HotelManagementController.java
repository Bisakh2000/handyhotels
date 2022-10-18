package com.Hotel.HotelManagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.Hotel.HotelManagement.Entity.Hotel;
import com.Hotel.HotelManagement.Service.HotelService;

@RestController
public class HotelManagementController {
	@Autowired
	private HotelService service;
	@GetMapping("/home")
	public String Home()
	{
		return "This is a hotel management wesite";
	}
	
	@GetMapping("/hotels")
	public List<Hotel> getHotelDetails(){
		return this.service.getHotelDetails();
	}
	
	@GetMapping("/hotels/{hotel_id}")
	
		public Optional<Hotel> getHotel(@PathVariable String hotel_id) {
		return this.service.getHotel(Long.parseLong(hotel_id));
	}
	
	@PostMapping("/hotels")
	public Hotel addHotel(@RequestBody Hotel hotel) {
		return this.service.addHotel(hotel);
		
	}
	
	@PutMapping("/hotels")
	public Hotel updateHotel(@RequestBody Hotel hotel) {
		return this.service.updateHotel(hotel);
		
	}
	
	@DeleteMapping("/hotels/{hotel_id}")
	public ResponseEntity<HttpStatus> deleteHotel(@PathVariable String hotel_id){
		try {
			this.service.deleteHotel(Long.parseLong(hotel_id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
