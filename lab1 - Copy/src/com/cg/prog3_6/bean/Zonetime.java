package com.cg.prog3_6.bean;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Zonetime {
	public static void zone(String s)
	{
		ZonedDateTime z = ZonedDateTime.now(ZoneId.of(s));
		System.out.println(z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		zone(s);
	}

}
