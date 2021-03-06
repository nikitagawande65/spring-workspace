package com.myapp.spring.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.spring.dao.IFlightDataAccess;
import com.myapp.spring.domain.Flight;

@Service
public class FlightCommand implements IFlightCommand {
	
	@Autowired
	private IFlightDataAccess flightDataAccess;

	@Override
	public List<Flight> searchBySourceCityAndDestinationCity(String sourcecity, String destinationCity) {
		// TODO Auto-generated method stub
		return flightDataAccess.search(sourcecity, destinationCity);
	}

	@Override
	public String add(Flight flight) {
		// TODO Auto-generated method stub
		return flightDataAccess.add(flight);
	}

	@Override
	public String update(Flight flight) {
		// TODO Auto-generated method stub
		return  flightDataAccess.update(flight);
	}

	@Override
	public List<Flight> findAll() {
		// TODO Auto-generated method stub
		return  flightDataAccess.findAll();
	}

	@Override
	public Flight searchById(long id) {
		// TODO Auto-generated method stub
		return  flightDataAccess.searchById(id);
	}

	@Override
	public String remove(long id) {
		// TODO Auto-generated method stub
		return  flightDataAccess.remove(id);
	}

}
