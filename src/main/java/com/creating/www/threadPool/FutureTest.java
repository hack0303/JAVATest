package com.creating.www.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FutureTest {
    static Executor ect=Executors.newScheduledThreadPool(10);
	public FutureTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	ExecutorService ect_service=(ExecutorService) ect;
	ThreadPoolExecutor tpe=(ThreadPoolExecutor) ect_service;
	System.out.println(tpe.getActiveCount());

	}

}
