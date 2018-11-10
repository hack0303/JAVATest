package com.creating.www.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumber {
   private List<Integer> list;
   private static final int SIZE=10;

	public ListOfNumber() {
		list=new ArrayList<Integer>();
		for(int i=0;i<SIZE;i++) 
		{
			list.add(i);
		}
	}

	public static void main(String[] args) {
	try {
		PrintWriter pw=new PrintWriter(new File("out.txt"));
		for(int i=0;i<SIZE;i++)
		pw.write(i);
		pw.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
