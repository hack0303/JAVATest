package com.creating.www.classloader;

public class Test001 {

	public Test001() {
		// TODO Auto-generated constructor stub
	}

	static class InnerTest001 {
		static {
			System.out.println("inner001");
		}

		public InnerTest001() {
			// TODO Auto-generated constructor stub
		}
	}

	static class InnerTest002 {
		static {
			System.out.println("inner002");
		}
	}

	public static void main(String[] args) {
		ClassLoader c0 = Test001.class.getClassLoader();
		ClassLoader c1 = c0.getParent();
		ClassLoader c2 = c1.getParent();
		System.out.println(c0);
		System.out.println(c1);
		System.out.println(c2);
		ClassLoader c_inner_001 = InnerTest001.class.getClassLoader();
		ClassLoader c_inner_002 = InnerTest002.class.getClassLoader();
		System.out.println(c_inner_001);
		System.out.println(c_inner_002);
		ClassLoader c_my = new ClassLoader() {
			@Override
			protected Class<?> findClass(String name) throws ClassNotFoundException {
				System.out.println("c_my");
				return super.findClass(name);
			}
		};
		System.out.println(c_my);
		Class<?> c_my_inner_01 = null;
		try {
			c_my_inner_01 = c_my.loadClass("com.creating.www.classloader.Test001$InnerTest001");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			c_my_inner_01.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			try {
				(c_inner_001.loadClass("com.creating.www.classloader.Test001$InnerTest001")).newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
