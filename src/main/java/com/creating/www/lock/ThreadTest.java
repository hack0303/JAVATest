package com.creating.www.lock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.function.Consumer;

public class ThreadTest {
	private static List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
	static CyclicBarrier cb = new CyclicBarrier(5);

	public ThreadTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++)
			list.add(i);
		// TODO Auto-generated method stub
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					cb.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list.forEach(new Consumer<Integer>() {
					@Override
					public void accept(Integer t) {
						System.out.println(t);
					}
				});
				// for(int i:list)
				// System.out.println(i);
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					cb.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < 1000; i++)
					list.add(i);
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					cb.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < 1000; i++)
					list.add(i);
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					cb.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < 1000; i++)
					list.add(i);
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
