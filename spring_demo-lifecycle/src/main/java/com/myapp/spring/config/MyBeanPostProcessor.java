package com.myapp.spring.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Post processor after"+beanName);
		return bean;
				//PostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
@Override
public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	// TODO Auto-generated method stub
	System.out.println("Post processor before"+beanName);
	return bean;
			//PostProcessor.super.postProcessBeforeInitialization(bean, beanName);
}
	
	
}
