package com.cg.prog3_3.bean;
import java.time.*;
import java.util.*;
public class Differencedate {
	public static void diff(LocalDate pdate )
	{
		LocalDate now = LocalDate.now();
	    Period diff = Period.between(pdate, now);
	    System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(), diff.getDays());	
	}
	public static void main(String[] args) {
		LocalDate pdate = LocalDate.of(2018, 12, 12);
		diff(pdate);
	  }
	}
