package com.myapp.spring;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.myapp.spring.application.IFlightCommand;
import com.myapp.spring.config.AppConfig;
import com.myapp.spring.domain.Flight;

public class FlySmartSearchClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

AbstractApplicationContext container=
new AnnotationConfigApplicationContext(AppConfig.class);
IFlightCommand flightCommand=
container.getBean(IFlightCommand.class);
List<Flight> list=
flightCommand.searchBySourceCityAndDestinationCity("bluru",
		"Kolkata");

Comparator<Flight> sortByfare=(f1,f2)->
((Double)f1.getFare()).compareTo(f2.getFare());

Comparator<Flight> sortByDuration=(f1,f2)->
((Double)f1.getDuration()).compareTo(f2.getDuration());

Comparator<Flight> sorted=sortByfare.thenComparing(sortByDuration);
Collections.sort(list, sorted);
list.forEach(System.out::println);

container.close();

		
	}

}
