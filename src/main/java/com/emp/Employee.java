package com.emp;

public class Employee {
	private String employeeName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void displayName() {
		System.out.println("Employee Name:"+employeeName);
	}
}
