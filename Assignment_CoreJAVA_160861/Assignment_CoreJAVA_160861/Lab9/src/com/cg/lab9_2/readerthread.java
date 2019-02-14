package com.cg.lab9_2;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class readerthread implements Runnable {

	static FileInputStream fis=null;
	static int r=0;
	static String t=null;
	protected BlockingQueue queue = null;
	public readerthread(BlockingQueue queue ){
        this.queue = queue;
	}
	/*public static void main(String[] args) throws IOException {
		Thread t1 = new Thread();
		t1.start();
		
		

			

			
		
	}*/
			@Override
			public void run() {
				
				try {
					fis=new FileInputStream("input.txt");
				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				byte[] b = null;
				try {
					b = new byte[fis.available()];
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					r=fis.read(b);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				t=String.valueOf(r);
				

				// TODO Auto-generated method stub
				BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);	
				//		String s=new String(null, fis.read());
				//String s=(String)fis.read();
				try {
					queue.put(t);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			}
		
	}


}
