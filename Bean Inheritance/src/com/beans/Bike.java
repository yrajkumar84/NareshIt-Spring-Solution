package com.beans;


public class Bike {
	
	private String id;
	private String make;
	private String engine;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", make=" + make + ", engine=" + engine + "]";
	}
	


	
}
