package com.creating.www.lock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ObectWaitTest {
	static CyclicBarrier cb = new CyclicBarrier(3);
	static Object lock = new Object();

	public ObectWaitTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					cb.await();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (BrokenBarrierException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int x = 0;
				while (true) {
					synchronized (lock) {
						System.out.println("---1-");
						lock.notifyAll();
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					cb.await();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (BrokenBarrierException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				while (true) {
					synchronized (lock) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("---2-");
					}
				}

			}
		}).start();
		try {
			cb.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
