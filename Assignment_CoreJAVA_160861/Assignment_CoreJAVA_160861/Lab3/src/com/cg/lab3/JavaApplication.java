package com.cg.lab3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input: ");
		String username = sc.next();
		
		Pattern pat = Pattern.compile("[A-Za-z]{8,}_job");
		Matcher mat = pat.matcher(username);
		if(mat.matches())
			System.out.println("true");
		else
			System.out.println("false");
		
		sc.close();

	}
}
