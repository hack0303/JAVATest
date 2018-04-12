package com.creating.www.classinit;

public class PrintUnit {

	public PrintUnit() {
		// TODO Auto-generated constructor stub
		long start=System.currentTimeMillis();
		for(int i=0;i<1000000;i++){
			new Test001();
		}
		long end=System.currentTimeMillis();
		TimeCounter tc001=new TimeCounter(start,end);
        start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
			new Test002();
		}
        end=System.currentTimeMillis();
		TimeCounter tc002=new TimeCounter(start,end);
		System.out.println("-------初始化单元不赋值测试------");
		System.out.println("结果:"+tc001.gap());
		System.out.println("-------初始化单元赋值测试------");
		System.out.println("结果:"+tc002.gap());
	}
}
