package com.creating.www.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class NumberOfFileTest {

	public NumberOfFileTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream[] array = new FileInputStream[1 << 16];
		for (int i = 0; i < 1 << 16; i++) {
			try {
				System.out.println("[" + i + "]");
				FileInputStream fis = new FileInputStream("doc/test.txt");
				array[i] = fis;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
