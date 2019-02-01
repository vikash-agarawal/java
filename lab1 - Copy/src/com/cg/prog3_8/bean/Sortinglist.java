package com.cg.prog3_8.bean;
import java.util.Arrays;
public class Sortinglist {
	public static void main(String[] args)
	{
		Arrays.sort(args);
		for(int i = 0; i < args.length; i++) {
			if((args.length)%2==0)
			{
				if(i<(args.length/2))
				{
					System.out.println(args[i].toLowerCase());
				}
				else
				{
					System.out.println(args[i].toUpperCase());
				}
			}
			else
			{
				if(i<(args.length/2)+1)
				{
					System.out.println(args[i].toLowerCase());
				}
				else
				{
					System.out.println(args[i].toUpperCase());
				}
			}
	    }
	}
}
