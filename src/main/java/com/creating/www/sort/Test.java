package com.creating.www.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
		List<A> list = new ArrayList<A>();
		int i = 0;
		Comparator<A> c = new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {
				// return o1.getX()-o2.getX();from min to max
				return o2.getX() - o1.getX();// from max to min
			}
		};
		while (i++ < 1000) {
			System.out.println(i);
			list.add(new A(new Random().nextInt(30)));
			Collections.sort(list, c);
		}
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println("----:" + it.next());

		}
	}

}
