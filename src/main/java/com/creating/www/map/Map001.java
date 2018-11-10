package com.creating.www.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Map001 {
    private static Map<A,A> map=new HashMap<A,A>();
    private static List<A> list=new ArrayList<A>();
    private static int generateHashCode;
    private static class A
    {
    	private int i=new Random().nextInt(1000);
    	public A()
    	{
		}
    	@Override
    	public int hashCode() {
    		// TODO Auto-generated method stub
    		if(generateHashCode==(2^31)) generateHashCode=0;
    		return generateHashCode++;
    	}
    }
	public Map001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		for(int i=0;i<1000;i++) 
		{
			A a=new A();
			map.put(a, a);
			list.add(a);
		}
		for(A a:list) 
		{
			System.out.println(a.i);
		}
		long start=0;
		long end=0;
		start=System.currentTimeMillis();
		for(Map.Entry<A,A> entry:map.entrySet()) 
		{
			System.out.println(entry.getValue().i);
		}
		end=System.currentTimeMillis();
		long mapCount=end-start;
		start=System.currentTimeMillis();
		for(A a:list) 
		{
			System.out.println(a.i);
		}
		end=System.currentTimeMillis();
		long listCount=end-start;
		System.out.println("map:"+mapCount+",list:"+listCount);

	}

}
