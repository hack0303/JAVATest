package com.creating.www.thread;

public class ThreadJoin {

	public static void main(String[] args) {
		System.out.println("main.start");
		Thread t = new Thread(() -> {
			
			System.out.println("Mythread.start");
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Mythread.loop");
			}
		});
		t.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("sleep 5s");
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Mainthread.loop");
		}
	}

}
