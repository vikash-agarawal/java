package com.cg.prog6_1.bean;

public class Personmain extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Person obj=new Person("","Bharathi","F");
			if(obj.getfirstname().isEmpty() || obj.getlastname().isEmpty())
			{
				throw new Exception("name can not be empty");
			}
		System.out.println("first name :"+obj.getfirstname());
		System.out.println("last name :"+obj.getlastname());
		System.out.println("gender :"+obj.getgender());
		obj.setfirstname("abc");
		obj.setlastname("xyz");
		obj.setgender("M");
		System.out.println("first name :"+obj.getfirstname());
		System.out.println("last name :"+obj.getlastname());
		System.out.println("gender :"+obj.getgender());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
