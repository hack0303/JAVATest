package com.creating.www.interns;

public class Test001 {

	public Test001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String a="111";
		String b="111";
		String c="1111";
		String d="1111";
		String e=new String("1111");
		d.intern();
		String f=new String("1111");
		String g=new String(d);
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(c==d);
		System.out.println(d==e);
		System.out.println(d==f);
        System.out.println(e==f);
        System.out.println(d==g);
        g.intern();
        System.out.println(d==g);
        String h=new String("11111");
        String i="11111";
        System.out.println(h==i);
        h=new String("111111");
        h.intern();
        String j="111111";
        System.out.println(h==j);
        System.out.println(h.intern()==h);
        String k=new String("x")+"";
        String l="x";
        System.out.println(k.intern()==l);
	}

}
