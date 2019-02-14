package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class GenerateOutput {
	public static void main(String[] args) {
		
	
	Service e=new Service();
	Employee e2=new Employee("sathvik",20000,"147","Analyst");
int a=e.maxMedicalInsurance(e2);
System.out.println(e2.getEmployeeDetails());
	
	
  }
}