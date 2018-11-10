package com.creating.www.natives;

public class Test001 {

	public Test001() {
		// TODO Auto-generated constructor stub
	}
    static 
    {
    	System.loadLibrary("Native001");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test001().test();

	}
	private  native void test();

}
