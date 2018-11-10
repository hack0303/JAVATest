package com.creating.www.system;

public class Test3 {

	public Test3() {
		// TODO Auto-generated constructor stub
	}
    static class Clock{
    	static volatile long time=System.nanoTime();
    	static 
    	{
    		Thread t=new Thread(()->{
    			while(true) {
    			Clock.time=System.nanoTime();
    			//System.out.println("------------");
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
        while(true)
        {
        	System.out.println(Clock.time);
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}

}
