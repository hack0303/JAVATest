package com.creating.www.startup;

import java.io.IOException;

import com.creating.www.file.File2IOException;
import com.creating.www.file.FileLoad;

public class FileTest {

	public FileTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new FileLoad();
		} catch (File2IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				e.is.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
