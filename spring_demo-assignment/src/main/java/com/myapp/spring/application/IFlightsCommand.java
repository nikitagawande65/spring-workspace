package com.myapp.spring.application;

import java.util.List;

import com.myapp.spring.domain.Flights;



public interface IFlightsCommand {
	
	List<Flights> searchBySourceCityAndDestinationCity(String sname,String dname);

}
