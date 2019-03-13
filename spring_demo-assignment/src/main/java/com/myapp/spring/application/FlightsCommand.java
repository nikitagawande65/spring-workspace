package com.myapp.spring.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.spring.dao.IFlightsDataAccess;
import com.myapp.spring.domain.Flights;

@Service
public class FlightsCommand implements IFlightsCommand {

	@Autowired
	private IFlightsDataAccess FlightsDataAccess;
	
	@Override
	public List<Flights> searchBySourceCityAndDestinationCity(String sname, String dname) {
		// TODO Auto-generated method stub
		return FlightsDataAccess.search(sname,dname);
	}

}
