package com.cg.eis.pl;
import com.cg.eis.bean.*;
import com.cg.eis.service.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service s=new Service();
		try
		{
			Employee e=s.setdetails();
			s.findscheme(e.getSalary(), e.getDesignation(),e);
			s.getdetails();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

}
}
