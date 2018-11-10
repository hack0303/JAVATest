package com.creating.www.threadTest;

public class Interupt {
    static Object object=new Object();
    static Thread globalThread=null;
	public Interupt() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Thread t001=new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
				try {
					System.out.println("1");
					Thread.sleep(10*1000);
				} catch (InterruptedException e) {
					System.out.println("我被中断了");
				//	Thread.currentThread().interrupt();
				}
				}
			}
		});
		globalThread=t001;
		t001.start();
Thread t002=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("2");
				if(!globalThread.isInterrupted())
			        globalThread.interrupt();
				else System.out.println("已经被中断");
				System.out.println("再次中断");
				 globalThread.interrupt();
				 System.out.println("再次中断");
				 globalThread.interrupt();
				 System.out.println("再次中断");
				 globalThread.interrupt();
			}
		});
      t002.start();
	}
}
