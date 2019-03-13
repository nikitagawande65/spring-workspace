package com.myapp.spring.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myapp.spring.domain.Animal;

@Repository
public interface IAnimalDataAccess extends MongoRepository<Animal, Integer>{
	
	//spring data will generate the class ,we dont have to create it
	
	

}
