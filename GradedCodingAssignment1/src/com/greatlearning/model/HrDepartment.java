package com.greatlearning.model;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		String s = "Hr Department";
		return s;
	}
 
	public String getTodaysWork() {
		String s1 = "Fill today’s timesheet and mark your attendance";
		return s1;
	}
	
	public String getWorkDeadline() {
		String s2 = "Complete by EOD";
		return s2;
	}
	
	public String doActivity() {
		String s4 = "team Lunch";
		return s4;
	}

}
