package com.creating.www.string;

import java.io.UnsupportedEncodingException;

public class StringTest {
static String s;
StringBuffer sbf;
StringBuilder sbd;
	public StringTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		s="大家好";
        try {
			byte[] bs=s.getBytes("UTF-8");
	        for(byte b:bs) 
	        {
	        	System.out.println(b);
	        }
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
