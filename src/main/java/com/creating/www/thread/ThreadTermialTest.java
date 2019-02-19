package com.creating.www.thread;
/**
 * 测试守护进程对于退出程序的影响
 * 
 * */
public class ThreadTermialTest {
	static class AThread extends Thread{
		public AThread() {
//this.setDaemon(true);
}
		@Override
		public void run() {
			while(true) 
			{ 
				System.out.println("hehe");
			    try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}
	}
	public static void main(String[] args) {
	
		new AThread().start();
		Runtime.getRuntime().addShutdownHook(new Thread(()->{
			System.out.println("byebye");
		}));
		synchronized(ThreadTermialTest.class) 
		{
			try {
				ThreadTermialTest.class.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.exit(0);
	}

}
