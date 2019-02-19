package com.creating.www.thread;

public class InterruptedTest001 {
	private static Integer i = new Integer(0);

	private static class Thread001 extends Thread {
		@Override
		public void run() {
			while (true) {
				System.out.println("Thread001休息");
				try {
					synchronized (i) {
						i.wait();
					}
				} catch (InterruptedException e) {
					System.out.println("Thread001已经休息了");
					Thread.currentThread().start();
				}
			}
		}
	}

	private static class Thread002 extends Thread {
		@Override
		public void run() {

		}
	}

	public InterruptedTest001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Thread001 t001 = new Thread001();
		t001.start();
		while (true) {
			synchronized (i) {
				i.notify();
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
