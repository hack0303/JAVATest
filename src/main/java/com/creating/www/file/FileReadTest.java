package com.creating.www.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {

	private File file = new File("doc");

	public FileReadTest() {
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		File[] files = file.listFiles();
		for (File file : files) {
			System.out.println(file.getName());
			FileReader fr = null;
			try {
				fr = new FileReader(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BufferedReader bfr = new BufferedReader(fr);
			try {
				while (bfr.ready())
					System.out.println(bfr.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new FileReadTest();
	}
}
