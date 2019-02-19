package com.creating.www.thread;

public class Runnable001 implements Runnable {
	private String thread_info = "Runnable001";
	private String mything = "你好";

	public Runnable001() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true)
			System.out.println(thread_info + mything);
	}

}
