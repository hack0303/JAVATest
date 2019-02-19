package com.creating.www.sup;

/**
 * 试自己给父亲类创建带参数构造器，查看子类初始化，编译器的行为
 */
public class Super013 extends Super011 {
	public Super013() {
		// TODO Auto-generated constructor stub
		super(0, 1);
		System.out.println("I do not ignored you");
	}

}
