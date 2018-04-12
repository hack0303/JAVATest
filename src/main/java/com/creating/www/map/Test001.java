package com.creating.www.map;

import java.util.*;
import java.util.Map.Entry;

public class Test001 {
Map<A,B> m=new HashMap<A,B>();
	public Test001() {
		// TODO Auto-generated constructor stub
	}
	public void put(A a,B b){
		m.put(a, b);
	}
	public void putN(int n){
		while(n-->0){
			m.put(new A(),new B());
		}
	}
    public void printAll(){
    	for(Map.Entry<A,B> entry:(m.entrySet())){
    	System.out.println("A:"+entry.getKey().a+","+entry.getKey().b+","+entry.getKey().str);
    	System.out.println("B:"+entry.getValue().a+","+entry.getValue().b+","+entry.getValue().str);
    	}
    	
    }
}
