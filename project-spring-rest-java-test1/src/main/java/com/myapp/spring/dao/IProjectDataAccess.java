package com.myapp.spring.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myapp.spring.domain.Project;

@Repository
public interface IProjectDataAccess extends MongoRepository<Project,Integer>{

	
	

	List<Project> findBySegment(String name);

	List<Project> findByCategory(String name);

//	List<Project> findByName(String name);

	List<Project> findByName(String name);

	
	
}
