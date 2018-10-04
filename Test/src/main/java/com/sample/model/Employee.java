package com.sample.model;

public class Employee {
	private int empCode;
	private String empName;

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee(int empCode, String empName) {
		super();
		this.empCode = empCode;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + "]";
	}

}
