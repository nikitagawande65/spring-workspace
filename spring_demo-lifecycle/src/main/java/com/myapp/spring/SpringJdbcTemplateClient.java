package com.myapp.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myapp.spring.application.IGetSaleCommand;
import com.myapp.spring.application.ISalesCommand;
import com.myapp.spring.application.SalesCommand;
import com.myapp.spring.config.AppConfig;
import com.myapp.spring.domain.sales;


public class SpringJdbcTemplateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext springContainer =
				new AnnotationConfigApplicationContext(AppConfig.class);
		springContainer.registerShutdownHook();
		ISalesCommand salesCommand=springContainer.getBean(ISalesCommand.class);
		
		sales sales1=new sales(2,"Iphone9",110000);
		salesCommand.update(sales1);
		
		
		
		System.out.println(salesCommand.loadAll());
		springContainer.close();
	}

}
