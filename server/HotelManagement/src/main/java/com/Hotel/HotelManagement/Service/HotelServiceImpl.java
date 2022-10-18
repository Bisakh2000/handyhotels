package com.Hotel.HotelManagement.Service;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.Hotel.HotelManagement.Dao.HotelDao;
import com.Hotel.HotelManagement.Entity.Hotel;

@Service
public class HotelServiceImpl implements HotelService {
	//List<Hotel> list;
	@Autowired
	private HotelDao hoteldao;
	
	public HotelServiceImpl(){
//		list = new ArrayList<>();
//		list.add (new Hotel("Casa Rasidency",101,"Bhubaneswar", "998877665"));
//		list.add(new Hotel("Neatflix and Chill",102,"Bhubaneswar","999999999"));
//		
	}

	@Override
	public List<Hotel> getHotelDetails() {
		// TODO Auto-generated method stub
		return hoteldao.findAll();
	}

	@Override
	public Optional<Hotel> getHotel(long hotel_id) {
		// TODO Auto-generated method stub
//		Hotel c = null;
//		for(Hotel id:list) {
//			if(id.getHotel_id()==hotel_id)
//			{
//				c=id;
//				break;
//			}
//		}
	return hoteldao.findById(hotel_id);
	}

	@Override
	public Hotel addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
//		list.add(hotel);
		hoteldao.save(hotel);
	return hotel;
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
//		list.forEach(e ->{
//			if(e.getHotel_id()==hotel.getHotel_id()) {
//				e.setHotelname(hotel.getHotelname());
//				e.setLocation(hotel.getLocation());
//				e.setPhonenumber(hotel.getPhonenumber());
//			
	//	}
		//});
		// TODO Auto-generated method stub
		hoteldao.save(hotel);
		return hotel;
	}

	@Override
		public void deleteHotel(long hotel_id) {
		// TODO Auto-generated method stub
		//list=this.list.stream().filter(e->e.getHotel_id()!=parseLong).collect(Collectors.toList());
		hoteldao.deleteById(hotel_id);
		
	}

	

}
