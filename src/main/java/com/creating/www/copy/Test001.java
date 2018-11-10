package com.creating.www.copy;

import java.util.Arrays;

public class Test001 {
    static int[] x= {1,2,3,4,5};
	public Test001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] x3=new int[3];
		int[] x2=new int[2];
		System.arraycopy(x, 0,x3,0,3);
		System.arraycopy(x, 3,x2,0,2);
		Arrays.stream(x3)
		.filter((n)->{return true;})
		.forEach(System.out::println);
		Arrays.stream(x2)
		.filter((n)->{return true;})
		.forEach(System.out::println);
		
	}

}
