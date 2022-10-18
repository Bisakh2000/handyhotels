package com.Hotel.HotelManagement.Service;

import java.util.List;
import java.util.Optional;

import com.Hotel.HotelManagement.Entity.Hotel;

public interface HotelService {
	
	public List<Hotel> getHotelDetails();

	public Optional<Hotel> getHotel(long hotel_id);
	
	public Hotel addHotel(Hotel hotel);
	
	public Hotel updateHotel(Hotel hotel);
	
	public void deleteHotel(long hotel_id );


}
