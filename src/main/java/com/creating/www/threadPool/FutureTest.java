package com.creating.www.threadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class FutureTest {
	static Executor ect = Executors.newScheduledThreadPool(10);

	public FutureTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ExecutorService ect_service = (ExecutorService) ect;
		ThreadPoolExecutor tpe = (ThreadPoolExecutor) ect_service;
		Future<Integer> f=tpe.submit(new Callable<Integer>() {
		@Override
		public Integer call() throws Exception {
			System.out.println("-----------------");
			return 1;
		}
		});
		while(true) 
		{
			if(f.isDone())
				try {
					System.out.println(f.get());
					break;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		System.out.println(tpe.getActiveCount());

	}

}
