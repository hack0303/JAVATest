package com.creating.www.threadPool;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BlockedTest {
	static Executor exeService = Executors.newFixedThreadPool(10);
	static Integer target01 = new Integer(1);
	static Integer target02 = new Integer(2);
	static CyclicBarrier cb = new CyclicBarrier(2);
	static int number = 1;

	public BlockedTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		exeService.execute(() -> {
			synchronized (target01) {
				try {
					cb.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("A -> target01Block");
				synchronized (target02) {
					System.out.println("A -> target02Block");
				}
			}
		});
		exeService.execute(() -> {
			synchronized (target02) {
				try {
					cb.await();

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("B -> target02Block");
				synchronized (target01) {
					System.out.println("B -> target01Block");
				}
			}
		});
		for (int i = 0; i < 8; i++) {
			exeService.execute(() -> {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("group-" + number++);
			});
		}
		while (true) {
			System.out.println(((ThreadPoolExecutor) exeService).getActiveCount());
		}

	}

}
