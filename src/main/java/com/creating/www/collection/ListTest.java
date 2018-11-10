package com.creating.www.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public ListTest() {
		// TODO Auto-generated constructor stub
	}
	public static class A{
		public int x;
		public A(int x) {this.x=x;}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return x==((A)obj).x;
		}
	}

	public static void main(String[] args) {
		List<A> list=new ArrayList<A>();
		list.add(new A(1));
		list.add(new A(1));
        System.out.println(list.size());
	}

}
