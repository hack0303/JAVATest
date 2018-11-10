package com.creating.www.bitmap;

import java.util.BitSet;

public class Bitmap {
   private static BitSet b=new BitSet(8);
 //  private BitMap b_map=new BitMap(1024);
	public Bitmap() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) 
	{
		System.out.println(1>>6);
		System.out.println(b.size());
	}
}
