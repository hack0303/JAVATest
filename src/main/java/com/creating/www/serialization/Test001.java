package com.creating.www.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Test001 implements Serializable {
    private int x;
    private String str;
    private static class SerTest001 implements Serializable{
    	private String s;
    	private transient int i=10086;
    	public SerTest001() {
			// TODO Auto-generated constructor stub
		}
		/**
		 * @return the s
		 */
		public String getS() {
			return s;
		}
		/**
		 * @param s the s to set
		 */
		public void setS(String s) {
			this.s = s;
		}
		/**
		 * @return the i
		 */
		public int getI() {
			return i;
		}
		/**
		 * @param i the i to set
		 */
		public void setI(int i) {
			this.i = i;
		}
    	
    }
	public Test001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SerTest001 st=new SerTest001();
     st.setI(10087);
     st.setS("测试");
     File file=new File("test.txt");
     ObjectOutputStream oos=null;
     ObjectInputStream ois=null;
     SerTest001 inst=null;
     try {
    	   OutputStream ops=new FileOutputStream(file);
		oos=new ObjectOutputStream(ops);
			try {
				oos.writeObject(st);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			InputStream is=new FileInputStream(file);
			ois=new ObjectInputStream(is);
			inst=(SerTest001) ois.readObject();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally 
     {
		if(oos!=null) 
		{
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ois!=null) 
		{
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
     }
     System.out.println(inst.i);
     System.out.println(inst.s);
     
	}

}
