package com.myapp.spring.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.spring.dao.ISalesDataAccess;
import com.myapp.spring.domain.sales;

@Service
public class SalesCommand implements ISalesCommand {

	@Autowired
	private ISalesDataAccess salesDataAccess;
	@Override
	public List<sales> loadAll() {
		// TODO Auto-generated method stub
		return salesDataAccess.getAllSales();
	}

	@Override
	public sales get(long id) {
		// TODO Auto-generated method stub
		return salesDataAccess.findById(id);
	}

	@Override
	public String insert(sales sales) {
		// TODO Auto-generated method stub
		salesDataAccess.save(sales);
		return "Object Inserted into db"+sales;
		
	}

	@Override
	public String update(sales sales) {
		// TODO Auto-generated method stub
		salesDataAccess.update(sales);
		return "Object updated into db"+sales;
		 
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		salesDataAccess.delete(id);
		
		
	}

}
