package com.myapp.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myapp.spring.domain.Flights;

@Repository
public class FlightsDataAccess implements IFlightsDataAccess {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SEARCH_FLIGHTS="select * from flights where sname=?and dname=?";
	
	
	@Override
	public List<Flights> search(String sname, String dname) {
		// TODO Auto-generated method stub
		List<Flights> flights=
				jdbcTemplate.query(SEARCH_FLIGHTS, new Object[]{sname,dname},
						new BeanPropertyRowMapper<Flights>(Flights.class));
		return flights;
	}
}
