package com.myapp.spring.api.rest;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.application.IFlightCommand;
import com.myapp.spring.domain.Flight;

@RestController
@Transactional
public class FlightRestApi implements IFlightRestApi {

	@Autowired
	private IFlightCommand flightCommand;
	
	@Override
	@PostMapping(value="/flights",consumes="application/json")
	public ResponseEntity<String> add(@RequestBody Flight flight) {
		// TODO Auto-generated method stub
		String result=flightCommand.add(flight);
		return new ResponseEntity<String>(result,HttpStatus.CREATED);
	}

	@Override
	@PutMapping(value="/flights/{id}",consumes="application/json")
	public ResponseEntity<String> update(@PathVariable("id")long id , @RequestBody Flight flight) {
		// TODO Auto-generated method stub
		Flight existingflight =flightCommand.searchById(id);
		BeanUtils.copyProperties(flight, existingflight);
		String result=flightCommand.update(existingflight);
		return new ResponseEntity<String>(result,HttpStatus.CREATED);
		}

	@Override
	@GetMapping("/flights/search/{sourceCity}/{destinationCity}")
	public ResponseEntity<List<Flight>> search(@PathVariable("sourceCity")String SourceCity, @PathVariable("destinationCity")String DestinationCity) {

		// TODO Auto-generated method stub
		return new ResponseEntity<List<Flight>>(flightCommand.searchBySourceCityAndDestinationCity(SourceCity, DestinationCity),HttpStatus.OK);
	}

	@Override
	@GetMapping("/flights")
	public ResponseEntity<List<Flight>> findAll() {
		// TODO Auto-generated method stub
		return new ResponseEntity<List<Flight>>(flightCommand.findAll(),HttpStatus.OK);
	}

//	@Override
//	@GetMapping("/flights/{id}")
//	public ResponseEntity<Flight> searchById(@PathVariable("id")Long id) {
//		// TODO Auto-generated method stub
//		return new ResponseEntity<Flight>(flightCommand.searchById(id),HttpStatus.OK);
//	}
	
	@Override
	@GetMapping(value = "/flights/{id}", consumes = "application/json") 
	public ResponseEntity<Flight> searchById(@PathVariable("id") long id) {
		// TODO Auto-generated method stub
		return new ResponseEntity<Flight> (flightCommand.searchById(id), HttpStatus.OK);
	} 

	@Override
	@DeleteMapping("/flights/{id}")
	public ResponseEntity<String> Remove(@PathVariable("id")Long id) {
		// TODO Auto-generated method stub
		String result=flightCommand.remove(id);
		return new ResponseEntity<String>(result,HttpStatus.NO_CONTENT);
	}

}
