package com.creating.www.sets;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private static Set<Long> sets=new HashSet<Long>();
	public SetTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
     sets.add(new Long(1));
     sets.add(new Long(1));
     sets.add(new Long(1));
     System.out.println(sets.size());
     
     for(Long s:sets) 
     {
    	 System.out.println(s);
     }
	}

}
