package com.vijay.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanNamePostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object beanObject, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanPostProcessor::postProcessBeforeInitialization:");
		System.out.println("The bean name::" + beanName + " BeanObject::" + beanObject);
		return beanObject;
	}

	public Object postProcessAfterInitialization(Object beanObject, String beanName) throws BeansException {

		System.out.println("BeanPostProcessor::postProcessAfterInitialization:");
		System.out.println("The bean name::" + beanName + " BeanObject::" + beanObject);
		return beanObject;
	}
}
