package com.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StudetSetEx {

	private Set<String> name;
	private List<String> Addrs;
	private Map<String,String> State;
	private Map<?,?> Dist;
	private Properties gender;
	public void setName(Set<String> name) {
		this.name = name;
	}
	public void setAddrs(List<String> addrs) {
		Addrs = addrs;
	}
	public void setState(Map<String, String> state) {
		State = state;
	}
	public void setDist(Map<?, ?> dist) {
		Dist = dist;
	}
	public void setGender(Properties gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student name is "+name+"he addrs is "+Addrs+"he is from "+State+"and district is "+Dist+"and gender"+gender;
	}
}
