package com.myapp.spring.dao;

import java.util.List;

import com.myapp.spring.domain.Flight;

public interface IFlightDataAccess {
	
	List<Flight> 
	search(String sourcecity,String destinationcity);

}
