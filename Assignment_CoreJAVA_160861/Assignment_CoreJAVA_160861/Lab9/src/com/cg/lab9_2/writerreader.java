package com.cg.lab9_2;

import java.util.concurrent.BlockingQueue;

public class writerreader implements Runnable{
	
	
	
	
	
	protected static BlockingQueue queue;
	public writerreader(BlockingQueue queue ){
        this.queue = queue;
	}
public static void main(String[] args) {
	
readerthread r=new readerthread(queue);
Thread t1=new Thread(r);
t1.start();

writerreader w=new writerreader(queue);
Thread t2=new Thread(w);
t2.start();


}

@Override
public void run() {
	// TODO Auto-generated method stub
	try {
		System.out.print(queue.take());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
