package com.creating.www.startup;

import com.creating.www.clone.Test001;

public class CloneTest {

	public CloneTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test001 t001=new Test001();
		Test001 t002=null;
		System.out.println(t001.getX());
		try {
		  t002=(Test001) t001.clone();
			System.out.println(t002.getX());
		   
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      System.out.println("t001和t002是否相等:"+(t001==t002));
	}

}
