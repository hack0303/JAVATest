package com.creating.www.volatiles;

public class Test001 {
    private static  int x;
    private static boolean flag01=false;
    private static boolean flag02=false;
	public Test001() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args) {
    	new Thread(new Runnable() {
    		@Override
    	public void run() {
    		for(int i=0;i<300;i++){
    			x++;
    			if(i==299) flag01=true;
    			//System.out.println(x);
    			try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    		
    	}}).start();;
    	new Thread(new Runnable() {
    		@Override
    	public void run() {
    		for(int i=0;i<300;i++){
    			x++;
    			if(i==299) flag02=true;
    			//System.out.println(x);
    			try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    		
    	}}).start();;
    	while(true){
    		if(flag01&&flag02) System.out.println(x);
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	}
        
    	
    }
}
