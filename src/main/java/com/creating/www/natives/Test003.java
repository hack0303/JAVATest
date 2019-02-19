package com.creating.www.natives;

public class Test003 {
	static {
		try {
			// String
			// dllPath=System.getProperty("user.dir")+File.separator+"doc/JnativeTest.dll";
			// String path=System.getProperty("java.library.path")+";"+dllPath;
			// System.setProperty("java.library.path",path);
			System.loadLibrary("JnativeTest");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			;
		}
	}

	public native void sayhello();

	public Test003() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			new Test003().sayhello();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
