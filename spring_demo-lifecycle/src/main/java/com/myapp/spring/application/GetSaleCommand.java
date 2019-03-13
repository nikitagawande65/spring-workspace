package com.myapp.spring.application;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.myapp.spring.dao.ISalesDataService;
import com.myapp.spring.domain.sales;
//business logic
//<bean id="" class="" intio-method="initialize" scope="singleton">
@Service("getSalesCommand")
@Scope("singleton")
public class GetSaleCommand implements IGetSaleCommand, InitializingBean, DisposableBean {
//setters based injection
	@Autowired
	private ISalesDataService dataServices;

public GetSaleCommand() {
	
}


public void setDataServices(ISalesDataService dataServices) {
	this.dataServices = dataServices;
}
@PostConstruct
public void initialize() {
	System.out.println("Inside Init");
	
}
@Override
public java.util.List<sales> findAll() {
	// TODO Auto-generated method stub
	return dataServices.getAllSales();
}
@PreDestroy
public void destroy() {
	System.out.println("Inside Destroy");
	

}


@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("After Properties set");
	
}
}