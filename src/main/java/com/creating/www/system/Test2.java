package com.creating.www.system;

public class Test2 {

	public Test2() {
		// TODO Auto-generated constructor stub
	}
    static class Clock{
    	static volatile long time=System.nanoTime();
    	static 
    	{
    		Thread t=new Thread(()->{
    			while(true) {
    			Clock.time=System.nanoTime();
    			System.out.println("------------");
    			try {
    				Thread.sleep(0,1000);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    			}
    		});
    		t.setDaemon(true);
    		t.start();
    	}
    }
	public static void main(String[] args) {
		long t1=System.nanoTime();
		for(int i=0;i<100000;i++) 
		{
			long xtime=Clock.time;
			System.out.println(xtime);
		}
		long t2=System.nanoTime();
        System.out.println(t2-t1);
       /**
        while(true)
        {
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        */
	}

}
