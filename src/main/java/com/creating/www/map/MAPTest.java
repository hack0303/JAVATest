package com.creating.www.map;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MAPTest {
      
	static class MyInteger implements Comparable<MyInteger>{
		public int id;
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return this.id==((MyInteger)obj).id;
		}
		@Override
		public int hashCode() {
			System.out.println("hashcode");
			return id;
		}
		@Override
		public int compareTo(MyInteger o) {
			System.out.println("compare");
			return this.id-o.id;
		}
		
		
	}
	public MAPTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = null;
		AbstractMap aMap = null;
		SortedMap sm = null;
		HashMap hMap = null;
		Hashtable hTable = null;
		Map<MyInteger,MyInteger> numbers=new TreeMap<>();
		for(int i=0;i<10;i++) 
		{
			MyInteger my=new MyInteger();
			my.id=i;
			numbers.put(my, my);
		}
		MyInteger my=new MyInteger();
		my.id=9;
		System.out.println("------------------------------");
		boolean flag1=numbers.keySet().contains(my);
		System.out.println("------------------------------");
		boolean flag2=numbers.containsKey(my);
		System.out.println("flag1:"+flag1);
		System.out.println("flag2:"+flag2);
		
	}

}
