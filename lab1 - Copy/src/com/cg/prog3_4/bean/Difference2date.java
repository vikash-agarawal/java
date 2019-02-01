package com.cg.prog3_4.bean;

import java.time.*;

public class Difference2date {
	public static void diff(LocalDate pdate, LocalDate qdate)
	{
	    Period diff = Period.between(pdate, qdate);
	    System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(), diff.getDays());	
	}
	public static void main(String[] args) {
		LocalDate pdate = LocalDate.of(2018, 01, 12);
		LocalDate qdate = LocalDate.of(2018, 11, 12);
		diff(pdate,qdate);
	  }
}