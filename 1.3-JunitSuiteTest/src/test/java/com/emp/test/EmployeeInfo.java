package com.emp.test;

public class EmployeeInfo {
	
	public int empSalary(int sal,int bonus) {
		return sal+bonus;
	}
	
	public String empFullName(String fname,String lname) {
		return fname+" "+lname;
	}
	
	public boolean empAge(int age) {
		if(age>18) {
			return true;
		}else {
			return false;
		}
	}
	
}
