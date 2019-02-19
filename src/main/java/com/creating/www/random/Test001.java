package com.creating.www.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test001 {

	public Test001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Random rd = new Random();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		for (int x = 10; x > 0; x--) {
			System.out.println(list.remove(rd.nextInt(x)));

		}

	}

}
