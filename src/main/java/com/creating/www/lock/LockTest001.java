package com.creating.www.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest001 {
	private static Lock lock=new ReentrantLock();
	private static int i=0;
	private static boolean flag001=false;
	private static boolean flag002=false;

	public LockTest001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Thread t001=new Thread001();
		t001.start();
		for(int ii=0;ii<10000;ii++) 
		{
			lock.lock();
			try {
			i++;
			}finally {
			lock.unlock();}
			if(ii==9999) flag001=true;
			try 
			{
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		while(true)
		if(flag001&&flag002) { 
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}
	private static class Thread001 extends Thread
	{ 
		@Override
		public void run() {
				for(int ii=0;ii<10000;ii++) {
					lock.lock();
					try {
					i++;}finally {
					lock.unlock();}
					if(ii==9999) flag002=true;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}

	}

}
