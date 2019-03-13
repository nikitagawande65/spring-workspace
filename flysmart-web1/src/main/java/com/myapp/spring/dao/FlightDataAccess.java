package com.myapp.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myapp.spring.domain.Flight;

@Repository
public class FlightDataAccess implements IFlightDataAccess {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static final String SEARCH_FLIGHTS
	="select * from FLIGHT where SOURCECITY=? and DESTINATIONCITY=?";
	
	@Override
	public List<Flight> search(String sourcecity, String destinationcity) {
		// TODO Auto-generated method stub
		List<Flight> flights=
				jdbcTemplate.query(SEARCH_FLIGHTS, 
			new Object[]{sourcecity,destinationcity},
		new BeanPropertyRowMapper<Flight>(Flight.class));
		return flights;
	}

}
