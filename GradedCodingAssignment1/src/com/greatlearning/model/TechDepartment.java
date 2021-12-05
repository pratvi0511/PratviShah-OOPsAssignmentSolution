package com.greatlearning.model;

public class TechDepartment extends SuperDepartment{
	public String departmentName() {
		String s = "Tech Department";
		return s;
	}
 
	public String getTodaysWork() {
		String s1 = "Complete coding of module 1";
		return s1;
	}
	
	public String getWorkDeadline() {
		String s2 = "Complete by EOD";
		return s2;
	}
	
	public String getTechStackInformation() {
		String s5 = "core Java";
		return s5;
	}

}
