package com.creating.www.thread;

public class Thread002 extends Thread {
   private String thread_info="Thread002";
   private String mything="你好";
	public Thread002() {
		// TODO Auto-generated constructor stub
	}
	public Thread002(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
		public void run() {
			// TODO Auto-generated method stub
		while(true) {
			super.run();
		    System.out.println(thread_info+mything);
		}
		}

}
