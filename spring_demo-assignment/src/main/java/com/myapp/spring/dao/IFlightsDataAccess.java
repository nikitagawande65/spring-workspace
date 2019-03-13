package com.myapp.spring.dao;

import java.util.List;

import com.myapp.spring.domain.Flights;




public interface IFlightsDataAccess {
	
   
    List<Flights> search(String sname,String dname);


	

}
