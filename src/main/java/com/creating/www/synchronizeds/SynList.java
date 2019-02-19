package com.creating.www.synchronizeds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynList {
	private static List<X> list = new ArrayList<X>();
	private static List<X> synList = Collections.synchronizedList(new ArrayList<X>());

	private static class X {
		private String x;

		public X(String x) {
			this.x = x;
		}

		public String getValue() {
			return x;
		}
	}

	public SynList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread001 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					list.add(new SynList.X("X"));
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		Thread thread002 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					list.add(new SynList.X("Y"));
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		Thread thread003 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					list.add(new SynList.X("Z"));
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		Thread thread004 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					// synchronized(synList) {
					System.out.println("---------????????-------------");
					Iterator<X> it = list.iterator();
					while (it.hasNext()) {
						System.out.println(it.next().getValue());
					}
					// }
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread001.start();
		thread002.start();
		thread003.start();
		thread004.start();
	}

}
