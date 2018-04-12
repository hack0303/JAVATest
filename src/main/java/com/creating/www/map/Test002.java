package com.creating.www.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Test002 {

	private static Map<Inner001, Inner002> m=new HashMap<Inner001, Inner002>();
	private static class Inner001{
		public String value001;
		public String value002;
		public Inner001() {
			// TODO Auto-generated constructor stub
		}
		public Inner001(String v001,String v002){
			this.value001=v001;
			this.value002=v002;
		}
		
	};
	private static class Inner002{
		public String value001;
		public String value002;
		public Inner002() {
			// TODO Auto-generated constructor stub
		}
		public Inner002(String v001,String v002){
			this.value001=v001;
			this.value002=v002;
		}
	};
	public Test002() {
		// TODO Auto-generated constructor stub
	}
	private static void unitOperation(){
		String a="a"+new Random().nextInt(32);
		String b="b"+new Random().nextInt(32);
		String c="c"+new Random().nextInt(32);
		String d="d"+new Random().nextInt(32);
		Inner001 i001=new Inner001(a,b);
		Inner002 i002=new Inner002(c,d);
		m.put(i001,i002);
	}
	private static void integrationOperation(){
		for(int i=0;i<10000;i++){
			unitOperation();
		}
	}
	public void test(){
		integrationOperation();
		Set<Entry<Inner001,Inner002>> entrySet=m.entrySet();
		Set<Inner001> keyset=m.keySet();
		Collection<Inner002> value=m.values();
		List<Entry<Inner001,Inner002>> entrylist=new LinkedList<Entry<Inner001,Inner002>>(entrySet);
        List<Inner001> keylist=new LinkedList<Inner001>(keyset);
        //还没写完
    //    Collections.sort(entrylist,(Map.Entry<Inner001,Innner002> a,Map.Entry<Inner001,Innner002> b)->{
    //    	return 0;
    //    });
        System.out.println("---------------entry排序测试开始----------------------");
        System.out.println("---------------key排序测试开始----------------------");
        System.out.println("---------------value排序测试开始----------------------");
         
	}

}
