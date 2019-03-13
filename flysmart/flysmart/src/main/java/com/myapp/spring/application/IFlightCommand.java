package com.myapp.spring.application;

import java.util.List;

import com.myapp.spring.domain.Flight;

public interface IFlightCommand {
	
	List<Flight> searchBySourceCityAndDestinationCity
	(String sourcecity,String destinationCity);

}
