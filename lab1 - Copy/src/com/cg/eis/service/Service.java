package com.cg.eis.service;
import java.util.*;
import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
public class Service implements Employeeservices {
	Employee e;
	@Override
	public Employee setdetails() throws EmployeeException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id");
		int id=sc.nextInt();
		System.out.println("enter employee name");
		String name=sc.next();
		System.out.println("enter employee slary");
		int salary=sc.nextInt();
		System.out.println("enter employee designation");
		String desig=sc.next();
		System.out.println("enter employee scheme");
		String schm=sc.next();
		e=new Employee(id,name,salary,desig,schm);
		sc.close();
		if(salary<3000)
		{
			throw new EmployeeException("salary should be greater than 3000");
		}
		return e;
	}
	@Override
	public void findscheme(int salary, String designation, Employee e) {
		// TODO Auto-generated method stub
		if(designation.equals("System Associate") && (salary>5000 && salary<20000))
     	   e.setInsurancescheme("C");
        else if(designation.equals("Programmer") && (salary>=20000 && salary<40000))
     	   e.setInsurancescheme("B");
        else if(designation.equals("Manager") && (salary>=40000))
     	   e.setInsurancescheme("A");
        else if(designation.equals("Clerk") && (salary<5000))
     	   e.setInsurancescheme("No");
	}

	@Override
	public void getdetails() {
		// TODO Auto-generated method stub
		System.out.println("Salary is: "+e.getSalary());
        System.out.println("Employee name is: "+e.getName());
        System.out.println("Employee id is: "+e.getId());
        System.out.println("Employee designation is: "+e.getDesignation());
        System.out.println("Employee insurance scheme is: "+e.getInsurancescheme());
	}
	
}
