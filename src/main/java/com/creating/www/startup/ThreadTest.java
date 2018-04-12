package com.creating.www.startup;


import com.creating.www.thread.*;

public class ThreadTest {

	public ThreadTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    // Runnable[] thread={new Runnable001(),new Thread001()};
  //  Thread[] thread={new Thread001(),new Thread001()};
   // thread.start();
	//ThreadPool tp=ThreadPool.getThreadPool();
	//for(int i=0;i<1000;i++) 
//	{
//		tp.addThread(new Thread001("thread"+i));
//	}
//	tp.startAllThread();
	TestInt ti=new TestInt();
	ti.start();
	}
	

}
