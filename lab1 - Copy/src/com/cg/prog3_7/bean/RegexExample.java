package com.cg.prog3_7.bean;
import java.util.*;
import java.util.regex.Pattern;
public class RegexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(Pattern.matches("(.){8,}_job", s))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
	}

}
