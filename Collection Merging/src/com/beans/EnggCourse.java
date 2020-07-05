package com.beans;

import java.util.List;

public class EnggCourse {
	
	private List<String> coursename;

	public void setCoursename(List<String> coursename) {
		this.coursename = coursename;
	}

	@Override
	public String toString() {
		return "EnggCourse [coursename=" + coursename + "]";
	}

	
}
