package com.creating.www.volatiles;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test002 {
	private static volatile int x;
	private static Counter c = new Counter();
	private static Lock lock = new ReentrantLock();

	private static class Counter {
		int xx;

		public Counter() {
			// TODO Auto-generated constructor stub
		}

		public void count() {
			xx++;
		}
	}

	public Test002() {
		// TODO Auto-generated constructor stub
	}

	private static class Thread001 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				// x++;
				lock.lock();
				try {
					c.count();
				} finally {
					lock.unlock();
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private static class Thread002 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				// x++;
				lock.lock();
				try {
					c.count();
				} finally {
					lock.unlock();
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Thread t001 = new Thread001();
		Thread t002 = new Thread002();
		t001.start();
		t002.start();
		while (true) {
			if (!t001.isAlive() && !t002.isAlive()) {
				System.out.println("xx:" + c.xx);
				break;
			}
		}

	}

}
