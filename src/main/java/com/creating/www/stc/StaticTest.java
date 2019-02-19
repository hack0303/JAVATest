package com.creating.www.stc;

/**
 * 静态测试
 * 
 */
public class StaticTest {

	static {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	{
		System.out.println("3");
	}

	public StaticTest() {
		// TODO Auto-generated constructor stub
	}

}
