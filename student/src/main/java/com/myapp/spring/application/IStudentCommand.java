package com.myapp.spring.application;



import java.util.List;

import com.myapp.spring.domain.Student;

public interface IStudentCommand {
	List<Student> findAll();
	String add(Student student);

}
