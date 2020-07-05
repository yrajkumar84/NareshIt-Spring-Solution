package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.StudetSetEx;





public class LooseCouplingApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cfgs/appcontext.xml");
		
		StudetSetEx s1=context.getBean("st",StudetSetEx.class);
	System.out.println(s1.toString());
		

		
	}
}
