package com.cg.prog3_5.bean;

import java.time.*;
import java.util.Scanner;
public class Purchased {
	public static void count(LocalDate pdate, int m, int d)
	{
		LocalDate fdate = pdate.plus(Period.of(0, m, d));
		System.out.println(fdate);
	}
	public static void main(String[] args) {
		LocalDate pdate = LocalDate.of(2018, 12, 12);
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int d=sc.nextInt();
		count(pdate,m,d);
		sc.close();
	}
}
