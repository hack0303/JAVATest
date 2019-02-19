package com.creating.www.startup;

import com.creating.www.bean001.*;

/**
 * 测试类构造器的访问权限设置 测试不加访问权限符号时默认的访问权限 结论:类定义只可以时public，
 * 构造器可以4种访问权限，注意protected，其实是传入了句柄，并不表示我可以像public一样初始化我继承了的类，只能进行super();
 * 
 * @author Da-Xian 2018年3月22日
 *
 */
public class App001 extends DefaultClass003 {
	public App001() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// DefaultClass001 d001=new DefaultClass001();//
		// DefaultClass002 d002=new DefaultClass002();//即使有父类句柄，default权限也阻止我们访问
		// DefaultClass003 d003=new DefaultClass003();//
		DefaultClass004 d004 = new DefaultClass004();
	}
}
