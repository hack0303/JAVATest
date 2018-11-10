package com.creating.www.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest001 {
    private static class Test001{
    	int x;
    }
	
	public ForEachTest001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Test001> list=new ArrayList<Test001>();
     for(int i=0;i<100;i++){
    	 Test001 t=new Test001();
    	 t.x=i;
    	 list.add(t);
     }
     int count=0;
     Test001 stub=list.get(0);
     for(Test001 t001:list)
     {
    	// stub.x=count++;
    	 stub=new Test001();
    	 System.out.println(stub.x);
     }
     
	}

}
