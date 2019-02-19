package com.creating.www.sup;

public class Super012 extends Super011 {
	/*
	 * 因为我们自己创建了构造器，那么编译器就不自己创建默认无参数构造器，如果想保留无参，必须自己写入代码。观察子类的调用，会发现资料构造其中会有
	 * 默认调用父类无参构造器行为，下面出错，是因为父类无参构造器不存在。
	 */
	public Super012() {
		// TODO Auto-generated constructor stub
		super(0, 1);// 注释掉该行查看测试效果
		System.out.println("I ignored you");
	}

}
