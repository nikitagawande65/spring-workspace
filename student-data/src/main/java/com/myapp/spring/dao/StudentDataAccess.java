package com.myapp.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myapp.spring.domain.Student;

@Repository
public class StudentDataAccess implements IStudentDataAccess {

	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	 
	 private final String SQL_GET_ALL = "select *  from student";
	 private final String SQL_INSERT_STUDENT = "insert into student(name,age,dept) values(?,?,?)";

	 
	@Override
	public String add(Student student) {
		// TODO Auto-generated method stub
		int a=jdbcTemplate.update(SQL_INSERT_STUDENT, student.getName(),student.getAge(),student.getDept());
	       
        if(a==1)
        return "Inserted";
        else
            return "Not Inserted";
	
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		// return jdbcTemplate.query(psc, rse)(SQL_GET_ALL, new BeanPropertyRowMapper<Student>(student.class));
		return jdbcTemplate.query(SQL_GET_ALL, new BeanPropertyRowMapper<Student>(Student.class));
	}

}
