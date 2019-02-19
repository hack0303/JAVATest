package com.creating.www.appends;

import java.util.HashSet;
import java.util.Set;

public class Test001 {

	public Test001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// System.out.println(new StringBuffer().toString().equals(""));
		StringBuilder sb = new StringBuilder();
		Set<Long> sets = new HashSet<Long>();
		sets.add(new Long(1));
		sets.add(new Long(2));
		sb.append(sets);
		sb.delete(0, 1);
		System.out.println(sb);
	}

}
