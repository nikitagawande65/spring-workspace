package com.myapp.spring.application;

import com.myapp.spring.dao.ISalesDataService;
import com.myapp.spring.domain.sales;


public class GetSaleCommand implements IGetSaleCommand {
private ISalesDataService dataServices;

public GetSaleCommand() {
	
}


public void setDataServices(ISalesDataService dataServices) {
	this.dataServices = dataServices;
}

public void initialize() {
	System.out.println("Inside Init");
	
}
@Override
public java.util.List<sales> findAll() {
	// TODO Auto-generated method stub
	return dataServices.getAllSales();
}

public void destroy() {
	System.out.println("Inside Destroy");
	

}
}