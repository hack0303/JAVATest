package com.creating.www.breaks;

public class Test001 {

	public Test001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		a:
     for(int x=0;x<100;x++) {
    	 b:
    	 for(int y=0;y<100;y++) {
    		 count++;
    		 if(x==49&&y==99) break a;
    	 }
     }
    // System.out.println(count);
     assert count==50*100 :"不对";
    // System.out.println("对的");
	}

}
