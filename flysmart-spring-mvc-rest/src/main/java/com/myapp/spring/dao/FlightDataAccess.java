package com.myapp.spring.dao;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.spring.domain.Flight;
 
@Repository
@Transactional
public class FlightDataAccess implements IFlightDataAccess {
 
    @Autowired
    private JdbcTemplate jdbcTemplate;
   
    public static final String SEARCH_FLIGHTS
    ="select * from FLIGHT where SOURCECITY=? and DESTINATIONCITY=?";
   
    public static final String SEARCH_SOURCE_CITY = "select SOURCECITY from FLIGHT";
   
    private final String SQL_FIND_FLIGHT_ID = "select *  from FLIGHT where FLIGHTID =?";
    private final String SQL_DELETE_FLIGHT = "delete from FLIGHT where flightId = ?";
    private final String SQL_UPDATE_FLIGHT = "update flight set SOURCECITY=? , DESTINATIONCITY=? , FARE=? , DURATION =?  where FLIGHTID=?";
    private final String SQL_GET_ALL = "select *  from FLIGHT";
    private final String SQL_INSERT_FLIGHT = "insert into flight(FLIGHTID,SOURCECITY,DESTINATIONCITY,FARE,DURATION) values(?,?,?,?,?)";
   
   
    public static final String SEARCH_DESTINATION_CITY = "select destinationCity from FLIGHT";
   
    @Override
   
    public List<Flight> search(String sourceCity, String destinationCity) {
        // TODO Auto-generated method stub
        List<Flight> flights=
                jdbcTemplate.query(SEARCH_FLIGHTS,
            new Object[]{sourceCity,destinationCity},
        new BeanPropertyRowMapper<Flight>(Flight.class));
        return flights;
    }
 
   
 
   
 
    @Override
   
    public String add(Flight flight) {
        // TODO Auto-generated method stub
       
        int a=jdbcTemplate.update(SQL_INSERT_FLIGHT, flight.getFlightid(),flight.getSourcecity(),flight.getDestinationCity(),flight.getFare(),flight.getDuration());
       
        if(a==1)
        return "Inserted";
        else
            return "Not Inserted";
    }
 
    @Override
   
    public String update(Flight flight) {
        // TODO Auto-generated method stub
       
        int  a=jdbcTemplate.update(SQL_UPDATE_FLIGHT,flight.getSourcecity(),flight.getDestinationCity(),flight.getFare(),flight.getDuration(),flight.getFlightid());
       
        if(a==1)
            return "Updated";
            else
                return "Not Updated";
    }
 
    @Override
    public List<Flight> findAll() {
        // TODO Auto-generated method stub
        return jdbcTemplate.query(SQL_GET_ALL, new BeanPropertyRowMapper<Flight>(Flight.class));
    }
 
   /* @Override
    public Flight searchById(long id) {
        // TODO Auto-generated method stub
    	Flight flight=
    			(Flight) jdbcTemplate.query(SQL_FIND_FLIGHT_ID,
		new Object[] {id}, new BeanPropertyRowMapper<Flight>(Flight.class));
       
        return flight;
    }
 */
    @Override
	public Flight searchById(long flightid) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SQL_FIND_FLIGHT_ID, new Object[] {flightid},
				new BeanPropertyRowMapper<Flight>(Flight.class));
	} 
    @Override
    public String remove(long id) {
        // TODO Auto-generated method stub
       
        int a=jdbcTemplate.update(SQL_DELETE_FLIGHT,new Object[] {id},new BeanPropertyRowMapper<Flight>(Flight.class));
       
        if(a==1)
            return "Removed";
            else
                return "Not Removed";
    }
 
}