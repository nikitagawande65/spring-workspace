package com.myapp.spring.application;

import java.util.List;

import com.myapp.spring.domain.Flight;

public interface IFlightCommand {
	
	List<Flight> searchBySourceCityAndDestinationCity
	(String sourcecity,String destinationCity);

	String add(Flight flight);
	
	String update(Flight flight);
	
	List<Flight> findAll();
	
	 Flight searchById(long id);
	 
	 
	 String remove(long id);

}
