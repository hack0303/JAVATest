package com.creating.www.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RemoveThreadTest {
	private static Map<Slot, Slot> map = new HashMap<Slot, Slot>();
	static Slot s;

	private static class Slot {
		private int out;

		Slot(int out) {
			this.out = out;
		}

		public int getOut() {
			return out;
		}
	}

	private static class Thread001 extends Thread {
		@Override
		public void run() {
			while (true) {
				map.remove(s);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private static class Thread002 extends Thread {
		@Override
		public void run() {
			while (true) {
				map.remove(s);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public RemoveThreadTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Slot(10086);
		for (int i = 0; i < 100; i++) {
			Slot item = new Slot(new Random().nextInt(1000));
			map.put(item, item);
		}
		map.put(s, s);
		Thread t001 = new Thread001();
		Thread t002 = new Thread002();
		t001.start();
		t002.start();
	}

}
