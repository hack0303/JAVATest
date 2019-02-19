package com.creating.www.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test002 {

	public Test002() {
		// TODO Auto-generated constructor stub
	}

	static class DateTimeRangeBean implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 6745134905823540236L;
		public String start;
		public String end;
		public Integer I;

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return start + " : " + end + " : " + I;
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f = new File("doc/test.obj");
		DateTimeRangeBean d = new DateTimeRangeBean();
		d.start = "1991-01-01 10:10:10";
		d.end = "1991-01-02 11:10:10";
		d.I = new Integer(10086);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(d);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		try {
			DateTimeRangeBean target = (DateTimeRangeBean) ois.readObject();
			System.out.println(target);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		ois.close();

	}

}
