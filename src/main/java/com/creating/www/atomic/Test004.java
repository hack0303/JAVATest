package com.creating.www.atomic;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Test004 {
	static class A{
		int x;
		public A() {
		}
		public A(int x) 
		{
			this.x=x;
		}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return x==((A)obj).x;
		}
	}
	static AtomicInteger count=new AtomicInteger(0);
	static A counter=new A(0);
	static AtomicReference<A> atoR=new AtomicReference<A>(counter);
	static CyclicBarrier cb=new CyclicBarrier(10);
	public Test004() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
     for(int i=0;i<10;i++) 
     {
    	 new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					cb.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int x=0;x<10000;x++) {
				compute();
				}
				
			}
		}).start();
     }
     while(true)
     {
    	 System.out.println(atoR.get().x+" : "+count.intValue());
    	 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
	}
	public static void compute() 
	{
		A except=atoR.get();
		A update=new A(except.x+1);
		if(atoR.compareAndSet(except,update)) 
		{
			count.incrementAndGet();
			return;
		}else 
		{
			count.incrementAndGet();
			compute();
		}
	}

}
