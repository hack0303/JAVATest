package com.creating.www.enumtest;

public class B {

	public B() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * switch规定，其中可以使用的变量有四种：int,byte,short,char;
	 * 
	 * 在java中，switch中的变量还可以enum 但不支持自动装箱拆箱
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A.Type.a);
		A.Type a = A.Type.a;
		switch (a) {
		case a:
			System.out.println("a");
		}
	}

}
