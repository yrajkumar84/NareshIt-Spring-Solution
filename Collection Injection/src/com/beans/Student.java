package com.beans;

import java.util.Arrays;
import java.util.List;

public class Student {

	private int marks[];
	private List<String>names;
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student data [marks="+Arrays.toString(marks)+", name="+names+"]";
	}
	
	
}
