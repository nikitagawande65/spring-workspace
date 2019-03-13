package com.myapp.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.myapp.spring.application.IFlightsCommand;
import com.myapp.spring.config.AppConfig;
import com.myapp.spring.domain.Flights;

public class FlightsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractApplicationContext springContainer =
				new AnnotationConfigApplicationContext(AppConfig.class);
		IFlightsCommand FilghtsCommand=
				springContainer.getBean(IFlightsCommand.class);
		
		List<Flights>list=FilghtsCommand.searchBySourceCityAndDestinationCity("delhi","banglore");
		
		
	//	Comparator<Flights> sortByfare=(f1,f2)->((Long)f1.getFare()).compareTo(f2.getFare());
		
		System.out.println(list);
		springContainer.close();
		}
		
		
		
	

}
