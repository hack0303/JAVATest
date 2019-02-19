package com.creating.www.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThreadPool {
	private List<Thread> list;
	private static ThreadPool tp;

	private ThreadPool() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<Thread>();
	}

	public static ThreadPool getThreadPool() {
		return tp == null ? tp = new ThreadPool() : tp;
	}

	public boolean addThread(Thread t) {
		return list.add(t);
	}

	public boolean removeThread(Thread t) {
		return list.remove(t);
	}

	public void startAllThread() {
		Iterator<Thread> it = list.iterator();
		while (it.hasNext()) {
			it.next().start();
		}
	}
}
