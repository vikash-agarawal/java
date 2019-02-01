package com.cg.eis.service;
import com.cg.eis.bean.*;
import com.cg.eis.exception.EmployeeException;
public interface Employeeservices {
	public Employee setdetails() throws EmployeeException;
	public void findscheme(int salary, String designation, Employee e);
	public void getdetails();
}
