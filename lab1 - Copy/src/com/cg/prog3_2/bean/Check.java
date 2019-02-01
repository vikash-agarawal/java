package com.cg.prog3_2.bean;
import java.util.Scanner;
public class Check {
	
	public static void  check(String s)
	{
		int i,f=0;
		char a,b;
		for(i=0;i<s.length()-1;i++)
		{
			a=s.charAt(i);
			b=s.charAt(i+1);
			if(a>b)
			{
				f=1;
				break;
			}
		}
		if(f==0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		check(s);
	}

}
