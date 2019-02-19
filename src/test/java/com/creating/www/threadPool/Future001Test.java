package com.creating.www.threadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

public class Future001Test {
	Executor e = Executors.newFixedThreadPool(10);
	List<Future<Integer>> array = new ArrayList<Future<Integer>>();

	public Future001Test() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void test001() {
		for (int i = 0; i < 1000; i++) {
			array.add(((ThreadPoolExecutor) e).submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					return new Integer(1);
				}
			}));
		}
		Future<Integer> a = null;
		array.forEach(x -> {
			try {
				System.out.println(x.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}
