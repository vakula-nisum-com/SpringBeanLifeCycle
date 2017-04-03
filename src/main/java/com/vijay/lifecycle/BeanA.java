package com.vijay.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanA
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	private String message;

	public BeanA() {

		System.out.println("Default Constructor");
	}

	public BeanA(String message) {
		System.out.println("Parameterized constructor");
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("SetMessage() method");
		this.message = message;
	}

	public void postConstruct() {

	}

	public void customInitMethod() {
		System.out.println("Custom init method");
	}

	public void customDestroyMethod() {
		System.out.println("Custom Destroy method");
	}

	@Override
	public String toString() {
		return "BeanA [message=" + message + "]";
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("in setApplicationContext:  method");

	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("in setBeanFactory method");

	}

	public void setBeanName(String arg0) {
		System.out.println("in setBean() method");

	}

	public void destroy() throws Exception {
		System.out.println("in dispozablebean: destroy() method");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("in InitializingBean: afterSetProperties() method");

	}

	@PostConstruct
	public void postConstrcut() {
		System.out.println("PostConstruct method");
	}
	
	@PreDestroy
	public void postDestroy() {
		System.out.println("PreDestroy Method");
	}

}
