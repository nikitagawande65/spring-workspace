package com.myapp.spring.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.dao.IProjectDataAccess;

import com.myapp.spring.domain.Project;

@RestController
public class ProjectRestApi {
	@Autowired
	private IProjectDataAccess dao;
	
	//http://localhost:port/animals
	/*@GetMapping("/project/{name}/{segment}/{category}")
	public ResponseEntity<List<Project>>findAll(){
		return new ResponseEntity<List<Project>>(dao.findAll(),HttpStatus.OK);
	}
*/	
	
	@GetMapping("/projects/search/{name}/{segment}/{category}/{categoryfamily}/{blackbelt}")
	public ResponseEntity<List<Project>> search(@PathVariable("name") String name, @PathVariable("segment") String segment, @PathVariable("category") String category ,@PathVariable("categoryfamily") String categoryfamily, @PathVariable("blackbelt") String blackbelt) 
	{
		return new ResponseEntity<List<Project>>(dao.findByNameAndSegmentAndCategoryAndCategoryfamilyAndBlackbelt(name,segment,category,categoryfamily,blackbelt), HttpStatus.OK);
	}  	
	/*@GetMapping("/projects/{segment}")
	public ResponseEntity<List<Project>> findBySegment(@PathVariable("segment")String segment){
		return new ResponseEntity<List<Project>>(dao.findBySegment(segment),HttpStatus.OK);	
		}
	@GetMapping("/projects/{category}")
	public ResponseEntity<List<Project>> findByCategory(@PathVariable("category")String category){
		return new ResponseEntity<List<Project>>(dao.findByCategory(category),HttpStatus.OK);	
		}
*/
	}
	