package com.cg.eis.bean;

import com.cg.eis.exception.EmployeeException;

public class Employee {

	public String name;
	double salary;
	String id;
	String Designation;
	public String InsuranceScheme;

	public Employee(String string, double i, String string2, String string3) {
		name = string;
		salary = i;
		Designation = string3;
		id = string2;
		InsuranceScheme = getInsuranceScheme(salary);
	}

	private String getInsuranceScheme(double sal) {
		String s = "";
		if (sal >= 40000) {
			s = "scheme a";
		} else if (sal >= 20000 && sal <= 40000) {
			s = "scheme b";
		} else if (sal >= 5000 && sal < 20000) {
			s = "scheme c";
		} else if (sal < 5000) {
			s = "no scheme";
		}

		if (sal < 3000) {
			try {
				throw new EmployeeException("exception");
			} catch (EmployeeException exe) {
				// System.out.println("catch block");
				System.out.println(exe.getMessage());
			}

		}
		return s;

		// Write your code here
		// should return the schemes as schemen a, scheme b, scheme c, no scheme
		// , null or raise an exception.

	}

	public String getEmployeeDetails() {
		// Write your code here
		// Should return a String in the below format
		return "Name: " + name + " Id: " + id + " Salary: " + salary
				+ " Designation: " + Designation + " InsuranceScheme: "
				+ InsuranceScheme;
		// Name: name Id: id Salary: salary Designation: Designation
		// InsuranceScheme: InsuranceScheme
	}
}
