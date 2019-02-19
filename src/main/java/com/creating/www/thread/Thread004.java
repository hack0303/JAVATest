package com.creating.www.thread;

public class Thread004 {
	private static int x;
	private static Integer lock = new Integer(0);
	private static boolean flag001 = false;
	private static boolean flag002 = true;

	private static class Thread001 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				count();
				if (i == 999)
					flag001 = true;
				try {
					Thread.sleep(1);
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
				count();
				if (i == 999)
					flag002 = true;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public Thread004() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Thread t001 = new Thread001();
		Thread t002 = new Thread002();
		t001.start();
		t002.start();
		while (true) {
			if (flag001 && flag002)
				System.out.println(x);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void count() {
		synchronized (lock) {
			x++;
		}
	}

}
