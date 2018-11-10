package com.creating.www.annotation;

@HEHE(info="王八蛋")
public class AnnotationTest {

	public AnnotationTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AnnotationTest.class.getAnnotation(HEHE.class).info());
		
	}

}
