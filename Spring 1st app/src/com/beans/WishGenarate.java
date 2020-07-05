package com.beans;

import java.util.Date;

public class WishGenarate {
	
	private String name;
	private Date date;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String WishMsg() {
		// TODO Auto-generated method stub
		return "Hi "+name+" todays date is "+date;
	}
}
