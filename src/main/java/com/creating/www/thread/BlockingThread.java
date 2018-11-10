package com.creating.www.thread;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingThread {
private static BlockingQueue queue=new LinkedBlockingQueue(50);
	public BlockingThread() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int i=0;i<60;i++) 
    {
    	try {
			queue.put(new Random().nextInt(100));
		}
    	catch (InterruptedException e) 
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    System.out.println(queue.size());
	}

}
