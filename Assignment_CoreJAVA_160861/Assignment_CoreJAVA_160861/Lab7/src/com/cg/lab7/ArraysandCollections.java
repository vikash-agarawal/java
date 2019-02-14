package com.cg.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysandCollections {
	public static void main(String[] args) {

		ArraysandCollections t=new ArraysandCollections(); //Object for this class to call getSorted(int[]) method.
		int[] a = {12,23,96,45}; //Declaring an int array.
		int[] b = new int[a.length]; //Creating a new array.
		b = t.getSorted(a); //Loading the data into the new array.
		for(int i : b)
			System.out.println(i); //Finally printing the array.
	}
	
	public int[] getSorted(int[] arr){
		List<Integer> l1 = new ArrayList<Integer>(arr.length); //Array list to sort the list later.
		int[] res = new int[arr.length]; //Array to convert list and load into it. 
		for(int i = 0; i < arr.length; i++){
			StringBuilder sb = new StringBuilder(Integer.toString(arr[i])); //(StringBuilder)SB to convert Integer to String
			String s = sb.reverse().toString(); // To reverse the SB and cast it to String
			Integer a = Integer.valueOf(s); //Converting the resultant String to Integer.
			l1.add(a); //Adding the value into the list.
		}
		Collections.sort(l1); //Sorting the entire list into ascending order.
		for(int i = 0; i < arr.length; i++)
			res[i] = l1.get(i); //Loading every element in the list into int array.
		return res; //returning the resultant array to main method.
	}
}
