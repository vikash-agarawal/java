package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

interface EmployeeService {
  //Write your code here
	int SchemeCBal = 1000;
	int SchemeBBal = 5000;
	int SchemeABal = 15000;
	public int maxMedicalInsurance(Employee e1);
	
}


public class Service implements EmployeeService {

  //Write your code here
	public int maxMedicalInsurance(Employee e1){
		int k=0;
		if(e1.InsuranceScheme=="scheme a"){
			
			k=15000;
		}
if(e1.InsuranceScheme=="scheme b"){
			
			k=5000;
		}
if(e1.InsuranceScheme=="scheme c"){
	
	k=1000;
}
return k;
}
}
