package com.cg.lab3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class JavaStrings {



		public static void main(String[] args) {
			// TODO Auto-generated method stub

			JavaStrings l=new JavaStrings();

			String[] a = { "Shravya", "Joshi", "Apple", "Banana" };
			String[] b = l.strings(a);
			for (String s : b)
				System.out.println(s);

		}

		public String[] strings(String[] arr) {

			String[] arr1 = new String[arr.length];

			Arrays.sort(arr);
			int i = 0;
			for (String s : arr) {
				if (arr.length % 2 == 0) {
					if (i < (arr.length / 2)) {
						arr1[i] = s.toUpperCase();
						i++;
					} else {
						arr1[i] = s.toLowerCase();
						i++;
					}
				}
				else{
					if (i <= (arr.length / 2)) {
						arr1[i] = s.toUpperCase();
						i++;
					} else {
						arr1[i] = s.toLowerCase();
						i++;
					}
				}
			}

			return arr1;
		}

	}

