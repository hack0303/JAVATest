package com.creating.www.bean005;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SortObject implements Comparable<SortObject> {
	final public int id = new Random().nextInt() % 10000;

	public SortObject() {
		// TODO Auto-generated constructor stub
		// System.out.println(id);
	}

	@Override
	public int compareTo(SortObject o) {
		// TODO Auto-generated method stub

		return id - o.id;
	}

	public static void sortCollection(List<SortObject> list) {
		Collections.sort(list);
		Iterator<SortObject> i = list.iterator();
		while (i.hasNext()) {
			System.out.println("---" + i.next().toString());
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "数值ID:" + id;
	}
}
