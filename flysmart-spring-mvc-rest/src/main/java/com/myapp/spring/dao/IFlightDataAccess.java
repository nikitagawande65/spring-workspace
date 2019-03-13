package com.myapp.spring.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.myapp.spring.domain.Flight;

public interface IFlightDataAccess {
	
	List<Flight> 
	search(String sourceCity,String destinationCity);
	
	String add(Flight flight);
	
	String update(Flight flight);
	
	List<Flight> findAll();
	
	 Flight searchById(long id);
	 
	 String remove(long id);

	


}
