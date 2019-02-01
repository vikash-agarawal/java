package com.cg.prog2_3.bean;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj=new Person("Divya","Bharathi","F");
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
}
