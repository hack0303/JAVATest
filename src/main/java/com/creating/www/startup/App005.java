package com.creating.www.startup;

import java.util.*;
import com.creating.www.bean005.*;
/**
 * @author Da-Xian 2018年3月26日
 * 排序接口
 * 还存在比较溢出的问题
 * 
 * */
public class App005 {

	public App005() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<SortObject> list=new ArrayList<SortObject>();
     for(int i=0;i<10000;i++)
    	 list.add(new SortObject());
	SortObject.sortCollection(list);
	}
}
