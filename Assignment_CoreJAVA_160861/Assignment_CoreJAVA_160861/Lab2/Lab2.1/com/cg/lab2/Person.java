package com.cg.lab2;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter phone number");
		String phoneNo=sc.next();
    PersonMain p=new PersonMain();
    Gender g = null;
    
    p.setFirstName("Shravya");
    p.setLastName("Joshi");
  //  p.setGender(gender);
 //   System.out.println("enter phone number");
    
    p.setPhoneNo(phoneNo);
    System.out.println("First name is:"+ p.getFirstName());
    System.out.println("Last name is:" +p.getLastName());
    System.out.println("Gender :"+g.F);
	}
}
