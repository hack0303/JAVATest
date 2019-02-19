package com.creating.www.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AfterDelete2Read {

	public AfterDelete2Read() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		File file = new File("doc/test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		// file.delete();
	}

}
