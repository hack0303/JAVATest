package com.creating.www.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class IteratorTest {
    private static List<Long> list=new ArrayList<Long>();
	public IteratorTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		long start=0;
		long end=0;
		for(int i=0;i<1000;i++) 
		{
			list.add(new Long(new Random().nextInt(10000)));
		}
		start=System.currentTimeMillis();
        Iterator<Long> iter=list.iterator();
        while(iter.hasNext())
        	System.out.println(iter.next().longValue());
		end=System.currentTimeMillis();
		long count01=end-start;
		start=System.currentTimeMillis();
		for(Long i:list) 
		{
			System.out.println(i.longValue());
		}
		end=System.currentTimeMillis();
		System.out.println("iterator:"+count01);
		System.out.println("for:"+(end-start));
	}

}
