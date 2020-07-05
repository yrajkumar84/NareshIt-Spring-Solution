package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.EnggCourse;


public class ClientApp {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cfgs/appcontext.xml");
		
		EnggCourse ws= context.getBean("ece",EnggCourse.class);
		
	
		System.out.println(ws.toString());
	}
}
