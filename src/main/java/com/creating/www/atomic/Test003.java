package com.creating.www.atomic;

import java.util.concurrent.atomic.AtomicReference;

public class Test003 {

	public Test003() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Integer value=new Integer(1);
		AtomicReference<Integer> aRefer=new AtomicReference<Integer>(value);
		aRefer.compareAndSet(1,2);

	}

}
