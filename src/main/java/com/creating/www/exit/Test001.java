package com.creating.www.exit;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Test001 {

	public Test001() {
		// TODO Auto-generated constructor stub
	}
    static Executor e=Executors.newFixedThreadPool(10);
	public static void main(String[] args) {
		new Thread(()->{
			while(true)
			{
				try {
					Thread.sleep(1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			System.out.println("thread");
			}
		}).start();
         Runtime.getRuntime().addShutdownHook(new Thread(()->{
        	 System.out.println(1111);
         }));
		e.execute(()->{
			while(true){
				try {
					Thread.sleep(10);
					System.out.println("1");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	  
      System.exit(0);
	}

}
