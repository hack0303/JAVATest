package com.creating.www.set;

import java.util.HashSet;
import java.util.Set;

public class Test002 {
 static   Set<Long> set01=new HashSet<Long>();
 static   Set<Long> set02=new HashSet<Long>();
	public Test002() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
     for(int i=0;i<1000;i++) 
     {
    	 Long l=new Long(i);
    	 if(i<100) set01.add(l);
    	 set02.add(l);
     }
     for(int i=1000;i<1010;i++)
     set01.add(new Long(i));
     set02.addAll(set01);
     for(Long ll:set02) 
     {
    	 System.out.println(ll);
     }
	}

}
