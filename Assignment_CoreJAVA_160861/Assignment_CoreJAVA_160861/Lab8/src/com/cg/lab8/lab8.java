package com.cg.lab8;

import java.io.*;
import java.util.*;
public class lab8 {
	static int n;
    static Object lock = new Object();


    public static void main(String[] args) {
      
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                // complete this function!
               BufferedReader sb=new BufferedReader(new InputStreamReader(System.in));
               String s = null;
			try {
				s = sb.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
               int i=Integer.parseInt(s);
               n=i;
          
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
            	int f=1;
            	for(int i=1;i<=n;i++){
            		f=f*i;
            	}
                // complete this function!
            	System.out.print(f);
            }
        });

        try {
            t1.start();
            t1.join();
            t2.start();
           
            t2.join();
        } catch (Exception e) {
            System.out.println("An exception has occured!");
        }
    }
}