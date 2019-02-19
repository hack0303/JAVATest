package com.creating.www.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Test001 {
	private AtomicInteger autoCounter = new AtomicInteger(0);

	public Test001() {
		// TODO Auto-generated constructor stub
		System.out.println("-------开始,autoCounter:" + autoCounter + "----------");
		System.out.println("-------增加,autoCounter:" + autoCounter.getAndIncrement() + "----------");
		System.out.println("-------减少,autoCounter:" + autoCounter.getAndDecrement() + "----------");
	}

}
