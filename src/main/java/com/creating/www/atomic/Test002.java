package com.creating.www.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Test002 {
     private static int counter001=0;
     private static AtomicInteger counter002=new AtomicInteger(0); 
	public Test002() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=0;
		long end=0;
		start=System.currentTimeMillis();
		for(int i=0;i<10000000;i++){
			counter001++;
		}
		end=System.currentTimeMillis();
		System.out.println("值:"+counter001+"花费时间:"+(end-start)+"ms");
		start=System.currentTimeMillis();
		for(int i=0;i<10000000;i++){
			counter002.incrementAndGet();
		}
		end=System.currentTimeMillis();
		System.out.println("值:"+counter002+"花费时间:"+(end-start)+"ms");

	}

}
