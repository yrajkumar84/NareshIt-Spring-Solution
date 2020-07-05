package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Bank;
import com.beans.Bike;

public class ClientApp {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cfgs/appcontext.xml");
		
	//	Bike ws=(Bike) context.getBean("pulsar1",Bike.class);
		
		
		
		//String res=ws.toString();
	//	System.out.println(res);
		
		Bank bn=context.getBean("u2",Bank.class);
		
		System.out.println(bn.toString());
	}
}
