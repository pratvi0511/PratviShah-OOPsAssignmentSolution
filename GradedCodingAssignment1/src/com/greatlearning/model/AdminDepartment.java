package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		String s = "Admin Department";
		return s;
	}
 
	public String getTodaysWork() {
		String s1 = "Complete your documents Submission";
		return s1;
	}
	
	public String getWorkDeadline() {
		String s2 = "Complete by EOD";
		return s2;
	}

}
