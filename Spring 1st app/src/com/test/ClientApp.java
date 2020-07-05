package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.WishGenarate;

public class ClientApp {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cfgs/appcontext.xml");
		
		WishGenarate ws=(WishGenarate) context.getBean("na",WishGenarate.class);
		
		String res=ws.WishMsg();
		System.out.println(res);
	}
}
