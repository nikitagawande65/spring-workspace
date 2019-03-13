package com.myapp.spring.dao;

import java.util.List;

import com.myapp.spring.domain.sales;



public interface ISalesDataAccess {
	
	List<sales> getAllSales();

	sales findById(long id);
	
	void save(sales sales);
	
	void update(sales sales);
	
	void delete(long id);
	
	List<sales> findByPrice(double price);

}
