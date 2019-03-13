package com.myapp.spring.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.dao.IAnimalDataAccess;
import com.myapp.spring.domain.Animal;

                   

@RestController
public class AnimalRestApi {
	
	@Autowired
	private IAnimalDataAccess dao;
	
	//http://localhost:port/animals
	@GetMapping("/animals")
	public ResponseEntity<List<Animal>>findAll(){
		return new ResponseEntity<List<Animal>>(dao.findAll(),HttpStatus.OK);
	}

	
	/*@GetMapping("/animals/{id}")
	public ResponseEntity<Animal>findById(int id){
		return new ResponseEntity<Animal>(HttpStatus.OK);
	}*/

	@GetMapping("/animals/{id}")
	public ResponseEntity<Animal>findById(@PathVariable("id")int id){
		java.util.Optional<Animal> a=dao.findById(id);
		return new ResponseEntity<Animal>(a.get(),HttpStatus.OK);
	}

}








/*
GetMapping("/flights/{id}")
//public ResponseEntity<Flight> searchById(@PathVariable("id")Long id) {
//	// TODO Auto-generated method stub
//	return new ResponseEntity<Flight>(flightCommand.searchById(id),HttpStatus.OK);
//}
*/