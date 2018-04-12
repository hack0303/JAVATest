package com.creating.www.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class TestInt {
private static int counter;//int 计数
private static int provious_counter;//用于主线程确认值是否不变化了
private static ThreadPool threadPool=ThreadPool.getThreadPool();//线程池
private static final int MAIN_THREAD_TIME=1000;//主线程休眠时间
private static final int TEST_THREAD_TIME=30;//测试线程休眠时间
private static final int CREATE_THREAD_COUNT=1000;//线程创建数
private static final int EVERY_THREAD_EXECUTE_COUNT=10;//每个线程处理次数
private static AtomicInteger atoCounter=new AtomicInteger(0);
//private static Before before;
//private static Target target;
//private static After after;
//private static Proxy proxy;
private static long starttime;//开始时间
private static long endtime;//结束时间
private static long duration;//持续时间
private static Object o=new Object();
	public TestInt() {
		// TODO Auto-generated constructor stub
/*		before=new Before() {
			
			@Override
			public void execute() {
				// TODO Auto-generated method stub
			System.out.println(System.currentTimeMillis());	
			}
		};
*/
/*		after=new After() {
			@Override
		public void execute() {
			// TODO Auto-generated method stub
				System.out.println(System.currentTimeMillis());	
		}};
*/
		Thread t=null;
		for(int i=0;i<CREATE_THREAD_COUNT;i++){
	    t=new Thread(()->{
		int x=0;
		do
		{
		//counter++;
		//counter+=1;
		//growbyself001();
		//growbyself002();
		atoCounter.incrementAndGet();	
		//	System.out.println(counter);
			System.out.println(atoCounter.get());
		try {
			Thread.sleep(TEST_THREAD_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		x++;
		}while(x<EVERY_THREAD_EXECUTE_COUNT);
		//counter+=1;
		});
			threadPool.addThread(t);		
		}
	}
	public static void start(){
		System.out.println();
		threadPool.startAllThread();
	/*	Target target=new Target() {
			@Override
			public void execute() {
				// TODO Auto-generated method stub
		threadPool.startAllThread();		
			}
		};
		proxy.addBefore(before);
		proxy.addTarget(target);
		proxy.addAfter(after);
		try {
			proxy.start();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		while(true){
			System.out.println(counter);
			try {
				Thread.sleep(MAIN_THREAD_TIME);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
    public synchronized static void growbyself001(){
    	counter++;
    }
    public static void growbyself002(){
    	synchronized(o){
    		counter++;
    	}
    }
}
