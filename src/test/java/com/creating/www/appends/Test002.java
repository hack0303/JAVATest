package com.creating.www.appends;

import java.util.HashSet;
import java.util.Set;

public class Test002 {

	public Test002() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String a = " 1 2 3    ";
		Set<Long> ss = new HashSet<Long>();
		String[] $a = a.split(" ");
		for (int count = 0; count < $a.length; count++) {
			if ($a[count].equals(""))
				System.out.println("空格");
			if (!$a[count].equals(""))
				ss.add(Long.valueOf($a[count]));
			System.out.println(count + ":" + $a[count]);
		}
		StringBuilder sb = new StringBuilder();
		sb.append(ss.toString());
		sb.delete(0, 1);
		sb.delete(sb.length() - 1, sb.length());
		System.out.println(sb.toString().replaceAll(", ", " "));
		System.out.println(ss);
	}

}
