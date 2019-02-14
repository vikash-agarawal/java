package com.cg.lab2;

import java.util.Scanner;

public class PositiveorNegative {
public static void main(String[] args){
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int i=sc.nextInt();
	if(i>0){
		System.out.println("The number is positive");
	}
	else if(i<0){
		System.out.println("The number is Negative");
	}
	else 
		System.out.println("The number is zero");
}
}
