package com.creating.www.delay;

import java.util.Queue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Test001 {
	private static DelayQueue<Delayed> q = new DelayQueue<Delayed>();

	private static class Element implements Delayed {
		private long date;
		private String s;

		public Element(long date, String s) {
			this.date = date;
			this.s = s;
		}

		public void setDate(long date) {
			this.date = date;
		}

		public long getDate() {
			return date;
		}

		public String getS() {
			return s;
		}

		@Override
		public long getDelay(TimeUnit unit) {

			return unit.convert(date - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
		}

		@Override
		public int compareTo(Delayed o) {
			// TODO Auto-generated method stub
			return (int) (this.date - ((Element) o).getDate());
		}
	}

	public Test001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			q.put(new Element(System.currentTimeMillis() + i * 3000, String.valueOf(i)));
		}
		while (true) {
			System.out.println(System.currentTimeMillis());
			try {
				System.out.println(((Element) q.take()).getS());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
