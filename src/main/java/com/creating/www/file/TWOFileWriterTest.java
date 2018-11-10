package com.creating.www.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TWOFileWriterTest {
	static int num=2;
	static int number=0;
  static CyclicBarrier cb=new CyclicBarrier(num);
	static File file =new File("doc/x.txt");
  public TWOFileWriterTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		for(int x=0;x<num;x++)
	   new Thread(()->{
		try {int myNumber=num++;
			cb.await();
			try {
				FileWriter fw=new FileWriter("doc/x.txt");
				while(true) {
				System.out.println(myNumber);
				fw.write(myNumber+'\n');
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	   }).start();

	}

}
