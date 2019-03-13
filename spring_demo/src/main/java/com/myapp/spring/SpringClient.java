package com.myapp.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myapp.spring.application.IGetSaleCommand;


public class SpringClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext springContainer = new ClassPathXmlApplicationContext("applicationcontext.xml");
		springContainer.registerShutdownHook();
		IGetSaleCommand saleCommand = springContainer.getBean("getSalesCommand",IGetSaleCommand.class);
		IGetSaleCommand saleCommand1 = springContainer.getBean("getSalesCommand1",IGetSaleCommand.class);
		System.out.println(saleCommand== saleCommand1);
		System.out.println(saleCommand.findAll());
		springContainer.close();
	}

}
