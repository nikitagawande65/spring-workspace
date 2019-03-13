package com.myapp.spring.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.spring.dao.IStudentDataAccess;
import com.myapp.spring.domain.Student;


@Service
public class StudentCommand implements IStudentCommand {

	@Autowired
	private IStudentDataAccess studentDataAccess;
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDataAccess.findAll();
	}

	@Override
	public String add(Student student) {
		// TODO Auto-generated method stub
		return studentDataAccess.add(student);
	}

}
