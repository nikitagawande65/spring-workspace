package com.myapp.spring.dao;

import java.util.List;

import com.myapp.spring.domain.Student;

public interface IStudentDataAccess {

	String add(Student student);
	
	List<Student> findAll();
}
