package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Flipkart;



public class LooseCouplingApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cfgs/appcontext.xml");
		
		Flipkart fp=context.getBean("fpk",Flipkart.class);
		
		String msg=fp.purchase(new String[] {"shirt","mobile"});
		System.out.println(msg);
	
	}
}
