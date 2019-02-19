package com.creating.www.bean008;

import java.util.Random;

public class TestAnnotation001 {
	/**
	 * hello
	 * 
	 */
	public TestAnnotation001() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param {{}}
	 * @return {@link Random}
	 * 
	 */
	public int test(int x1, int x2) {
		new Random().nextInt(1);
		return x1 + x2;
	}
}
