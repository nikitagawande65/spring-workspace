package com.myapp.spring.api.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.myapp.spring.domain.Flight;

public interface IFlightRestApi {
	
	
	//resource
	ResponseEntity<String> add(Flight flight);
	ResponseEntity<String> update(long id,Flight flight);
	ResponseEntity<List<Flight>> search(String SourceCity , String DestinationCity);
	ResponseEntity<List<Flight>> findAll();
//	ResponseEntity<Flight> searchById(Long id );
	ResponseEntity<String> Remove(Long id );
	ResponseEntity<Flight> searchById(long id);




}
