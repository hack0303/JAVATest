package com.creating.www.exception;
/**
 * 异常处理跳转
 * */
public class Test001 {

	public Test001() {
		// TODO Auto-generated constructor stub
	}
	public void test(){
		int x=10;
		try {
		System.out.println("111");
		System.out.println("111");
		System.out.println("111");
		x=1/0;
		System.out.println("111");
		System.out.println("111");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println(x);
		}
		System.out.println("不会影响到我的");
		}
	public static void main(String[] args)
	{
	
		new Test001().test();
	}

}
