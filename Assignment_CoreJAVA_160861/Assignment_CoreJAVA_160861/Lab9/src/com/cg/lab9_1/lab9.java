package com.cg.lab9_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class lab9 {
public static void main(String[] args) throws NumberFormatException, IOException{

	File f=new File("input.txt");
	FileOutputStream fos=new FileOutputStream("output.txt");
	try {
		Scanner	sc = new Scanner(f);
		String s=sc.nextLine();
		char[] c=s.toCharArray(); 

		int l=c.length;
		int[] t=new int[l];
		for(int i=0;i<l;i++){
			if(c[i]!=',')
			{
			int k=(int)c[i];
			if((k%2)==0){
			fos.write(k);
			fos.write(13);
			}
			
		}
	}
fos.close();
	
	}
	
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
