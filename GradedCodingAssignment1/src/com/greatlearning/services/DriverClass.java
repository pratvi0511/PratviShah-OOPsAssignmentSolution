package com.greatlearning.services;
import com.greatlearning.model.*;

public class DriverClass {
	public static void main(String[] args) {
		AdminDepartment a = new AdminDepartment();
		System.out.println("Welcome to "+ a.departmentName());
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadline());
		System.out.println(a.isTodayAHoliday());
		System.out.println("          ");
		
		HrDepartment h = new HrDepartment();
		System.out.println("Welcome to "+ h.departmentName());
		System.out.println(h.doActivity());
		System.out.println(h.getTodaysWork());
		System.out.println(h.getWorkDeadline());
		System.out.println(h.isTodayAHoliday());
		System.out.println("          ");
		
		TechDepartment t = new TechDepartment();
		System.out.println("Welcome to "+ t.departmentName());
		System.out.println(t.getTodaysWork());
		System.out.println(t.getWorkDeadline());
		System.out.println(t.getTechStackInformation());
		System.out.println(t.isTodayAHoliday());
	}

}
