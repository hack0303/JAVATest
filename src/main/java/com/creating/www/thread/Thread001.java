package com.creating.www.thread;

public class Thread001 extends Thread {
	private static int counter = 1;
	private static final int THREAD_SLEEP = 1000;// 线程休眠,单位ms

	public Thread001() {
		// TODO Auto-generated constructor stub
		counter++;
	}

	public Thread001(String name) {
		super(name + ":" + counter);
		counter++;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(this.getName());
			try {
				Thread.sleep(THREAD_SLEEP);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
