package com.creating.www.startup;

import com.creating.www.equals.*;

/**
 * 测试两个对象是否相等
 * 
 * */
public class EqualsTest {

	public EqualsTest() {
		// TODO Auto-generated constructor stub
	}
@SuppressWarnings("unlikely-arg-type")
public static void main(String[] args) {
	System.out.println(new A().equals(new A()));
	System.out.println(new C().equals(new A()));
	System.out.println(new B()==new B());
	System.out.println(new B().equals(new B()));
	System.out.println(new B().equals(null));
	System.out.println(new B().equals(new C()));
	System.out.println(new C() instanceof A);//继承关系句柄测试
	System.out.println(new C() instanceof C);//测试自身
	System.out.println(new D().equals(new B()));//相同父类的相等测试
}
}
