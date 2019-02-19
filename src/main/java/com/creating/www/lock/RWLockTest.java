package com.creating.www.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLockTest {
	static ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
	static List<Integer> list = new ArrayList<Integer>();
	static CyclicBarrier cb = new CyclicBarrier(9);

	public RWLockTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
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
					while (true)
						for (int x = 0; x < 1000; x++) {
							rwLock.writeLock().lock();
							try {
								list.add(x);
							} finally {
								rwLock.writeLock().unlock();
							}
							try {
								Thread.sleep(1);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
				}
			}).start();
		}
		for (int i = 0; i < 5; i++) {
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
					while (true)
						for (int x = 0; x < 1000; x++) {
							rwLock.readLock().lock();
							try {
								if (list.size() > 0)
									list.get(0);
							} finally {
								rwLock.readLock().unlock();
							}
						}
				}
			}).start();
		}

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
				while (true)
					for (int x = 0; x < 1000; x++) {
						rwLock.writeLock().lock();
						try {
							if (list.size() > 0)
								list.remove(0);
						} finally {
							rwLock.writeLock().unlock();
						}
						try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
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
