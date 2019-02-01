package com.cg.prog2_5.bean;

 enum Gender
{
	M,F;
}
public class Personmain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 obj=new Person2("Divya","Bharathi",Gender.F);
		System.out.println("first name :"+obj.getfirstname());
		System.out.println("last name :"+obj.getlastname());
		System.out.println("gender :"+obj.getGender());
		obj.setfirstname("abc");
		obj.setlastname("xyz");
		obj.setGender(Gender.M);
		System.out.println("first name :"+obj.getfirstname());
		System.out.println("last name :"+obj.getlastname());
		System.out.println("gender :"+obj.getGender());
	}

}
