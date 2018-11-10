package com.creating.www.classloader;

import java.net.URL;

public class ClassLoaderFindFile {

	public ClassLoaderFindFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     URL url=ClassLoaderFindFile.class.getResource("/classpath.txt");
    System.out.println(url);
    url=ClassLoaderFindFile.class.getResource("ClassLoaderFindFile.class");
    System.out.println(url);
    url=ClassLoaderFindFile.class.getClassLoader().getResource("ClassLoaderFindFile.class");
    System.out.println(url);
    url=ClassLoaderFindFile.class.getClassLoader().getResource("classpath.txt");
    System.out.println(url);
    url=ClassLoaderFindFile.class.getClassLoader().getResource("/classpath.txt");
    System.out.println(url);
	}

}
