package com.creating.www.threadTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import org.junit.Test;

public class ThreadTest {
    static int static_i=-1;
    static int value=0;
	static List<Integer> list=new ArrayList<Integer>();
	static int endCount=0;
	public ThreadTest() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void testPerformance() 
	{
		int n=1000;
		CyclicBarrier barrier=new CyclicBarrier(n);
		for(int i=0;i<1000;i++) 
		{
			//System.out.println(i);
			list.add(i);
			new Thread(new Runnable() {
				@Override
				public void run() {
					static_i++;
					Integer value_i=list.get(static_i);
					try {
						barrier.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (BrokenBarrierException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (ThreadTest.class) {
						value+=value_i.intValue();
						endCount++;
					//	System.out.println(endCount);
					}
					
				}
			}).start();
		}
		while(true) {
		if(endCount==n) {
		System.out.println(value);
		break;
		}
		}
		
	}

}
