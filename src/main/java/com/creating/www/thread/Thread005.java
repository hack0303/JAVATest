package com.creating.www.thread;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Thread005 {
	private static final long START_WAIT = 5000;// 1分半
	private static final long END_WAIT = 10000;// 50s
	private static AtomicInteger returnCounter = new AtomicInteger(0);

	private static class ReturnCounterTestThread extends Thread {
		@Override
		public void run() {
			long count = 0;
			long twinscount = 0;
			long returncount = 0;
			try {
				Thread.sleep(START_WAIT);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			while (true) {
				twinscount = returnCounter.intValue();
				if (twinscount == 0)
					twinscount++;
				System.out.println("----------" + count + "--" + ":" + twinscount + "------------");
				if (count == twinscount) {
					System.out.println("------------相等-------------");
					break;
				}
				count = twinscount;
				try {
					Thread.sleep(END_WAIT);
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
			for (int i = 0; i < 10; i++) {
				returnCounter.incrementAndGet();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public Thread005() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnCounterTestThread t = new ReturnCounterTestThread();
		Thread002 t02 = new Thread002();
		t.start();
		t02.start();

	}

}
