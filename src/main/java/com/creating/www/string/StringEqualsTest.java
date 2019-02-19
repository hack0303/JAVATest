package com.creating.www.string;

public class StringEqualsTest {

	static private class A {
		String str;

		public A() {
			// TODO Auto-generated constructor stub
			System.out.println("i'm a innerclass");
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			System.out.println("hello world");
			return super.toString();
		}

	};

	public StringEqualsTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 测试一个字符连接非字符串变量的自动转化测试，注意区分空格字符串和非空格字符串
	 */
	public static void test001() {
		System.out.println(1);
		System.out.println(1 + "");
		System.out.println(1 + "" + 2);
		System.out.println(1 + " " + 2);
	}

	/**
	 * 测试一个字符串连接时的JAVA自动调用对象的toString()方法
	 */
	public static void test002() {
		System.out.println("" + new A());
	}
}
