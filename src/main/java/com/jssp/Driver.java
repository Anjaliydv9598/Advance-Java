package com.jssp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String [] args) {
		System.out.println("Container Start ");
		//spring container
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//get the object of Student class from spring container
		Object ob = context.getBean("student");
		Student s = (Student)ob;
		s.m1();
		System.out.println(context.isActive());
		context.close();
		System.out.println(context.isActive());
		
	}
}
