package com.creating.www.collection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CollectionPerformance {
	private Map<String, TestObject001> a;
	private List<TestObject001> b;

	public CollectionPerformance() {
		a = new HashMap<String, TestObject001>();
		b = new ArrayList<TestObject001>();
	}

	private void assembly() {
		for (int i = 0; i < 100000; i++) {
			TestObject001 to = new TestObject001("key" + String.valueOf(new Random().nextInt(10000)),
					"value" + String.valueOf(new Random().nextInt(10000)));
			System.out.println(to.getStr() + ":" + to.getValue());
			a.put(to.getStr(), to);
			b.add(to);
		}
	}

	public void go() {
		String randomKey = "key" + String.valueOf(new Random().nextInt(10000));
		String[] randomKeys = new String[1000];
		for (int x = 0; x < 1000; x++) {
			randomKeys[x] = "key" + String.valueOf(new Random().nextInt(10000));
		}
		System.out.println(randomKey);
		long start1 = 0;
		long end1 = 0;
		long start2 = 0;
		long end2 = 0;
		start1 = System.currentTimeMillis();
		TestObject001 value = a.get(randomKey);
		for (String str : randomKeys) {
			value = a.get(str);
			System.out.println((value != null) ? value.getValue() : "没有");
		}
		end1 = System.currentTimeMillis();
		start2 = System.currentTimeMillis();
		for (String str : randomKeys) {
			value = a.get(str);
			boolean flag = false;
			for (TestObject001 bb : b) {
				if (bb.getStr() == randomKey) {
					System.out.println(bb.getValue());
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.println("没有");
		}
		end2 = System.currentTimeMillis();
		System.out.println("时间:" + String.valueOf(end1 - start1));
		System.out.println("时间:" + String.valueOf(end2 - start2));
	}

	public static void main(String[] args) {
		try {
			while (System.in.read() != -1) {
				System.out.println("开始了");
				CollectionPerformance c = new CollectionPerformance();
				c.assembly();
				c.go();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
