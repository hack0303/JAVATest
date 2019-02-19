package com.creating.www.exceptions;

import java.io.BufferedReader;

public class ExceptionTest002 {

	public ExceptionTest002() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println(getSomeThing());

	}

	private static int getSomeThing() {
		int i = 0;
		try {
			i++;
			return i;
		} finally {
			i++;
			System.out.println("final:" + i);
		}
	}

}
