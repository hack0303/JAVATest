package com.creating.www.startup;

import com.creating.www.bean002.*;

/**
 * 上溯测试
 * 
 * @author Da-Xian 2018年3月22日 测试上溯造型
 *
 */
public class App002 {
	private DefaultClass001 dc001;
	private DefaultClass002 dc002;
	private DefaultClass003 dc003;
	private DefaultClass004 dc004;

	public App002() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		App002 a = new App002();
		a.dc001 = new DefaultClass001();
		a.dc002 = new DefaultClass002();
		a.dc003 = new DefaultClass003();
		a.dc004 = new DefaultClass004();
		ParentClass[] pc = { a.dc001, a.dc002, a.dc003, a.dc004, new ParentClass() };
		Service.operationA_all(pc);
		System.out.println("Hello World!");

	}
}
