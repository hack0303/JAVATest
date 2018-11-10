package com.creating.www.set;

import java.util.HashSet;
import java.util.Set;

public class Test003 {

	public Test003() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<Integer> a=new HashSet<Integer>();
    Set<Integer> b=new HashSet<Integer>();
    a.add(1);
    a.add(2);
    b.add(3);
    b.add(4);
    //a.removeAll(b);
    System.out.println(a.retainAll(b));
    System.out.println(a);
    System.out.println(b);
	}

}
