package com.creating.www.system;

public class Test001 {

	public Test001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		long t1 = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			long t = System.nanoTime();
			System.out.println(t);
		}
		long t2 = System.nanoTime();
		System.out.println(t2 - t1);
	}

}
