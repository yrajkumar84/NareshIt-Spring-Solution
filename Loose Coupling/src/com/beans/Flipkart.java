package com.beans;

import java.util.Random;

public class Flipkart{
	
	private Courier courier;

	public void setCourier(Courier courier) {
	
		System.out.println("flipkart Courier");
		this.courier = courier;
	}
	
	public String purchase(String items[]) {
		Random rn=new Random();
		int orderid=rn.nextInt();
		String ststus=courier.deliver(orderid);
		
		
		return "Bill amt for your order is " +orderid+" is 500";
	}

}
