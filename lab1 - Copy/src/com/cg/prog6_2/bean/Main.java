package com.cg.prog6_2.bean;

import java.util.Random;

import com.cg.prog6_2.bean.Account;
import com.cg.prog6_2.bean.Person;

public class Main extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4728473813141179859L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("Smith", 22.0f);
		Person p2=new Person("Kathy", 12.0f);
		try
		{
			if(p1.getAge()<15.0f || p2.getAge()<15.0f)
			{
				throw new Exception("age should be greater than 15");
			}
		Random rand=new Random();
		int x=rand.nextInt(10000);
		int y=rand.nextInt(10000);
		if(x==y) {
			while(x==y)
			{
				y=rand.nextInt(10000);
			}
		}
		Account a1=new Account(x,2000,p1);
		Account a2=new Account(y,2000,p2);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		a1.deposite(2000);
		a2.withdraw(2000);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}
