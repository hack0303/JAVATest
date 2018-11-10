package com.creating.www.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

import com.creating.www.set.TreeSetTest.TestObj;

public class TreeSetTest {

	static class TestObj implements Cloneable,Comparable
	{
		public int x;
		public int y;
		public int z;
		
		@Override
		public boolean equals(Object obj) {
			if(obj==null) return false;
			if(!(obj instanceof TestObj)) return false;
			TestObj tObj=(TestObj) obj;
			return this.x==tObj.x&&this.y==tObj.y&&this.z==tObj.z;
		}
		@Override
		public String toString() {
			return String.format("[TestObj] %d %d %d",x,y,z);
		}
		@Override
		public int compareTo(Object o) {
			if(o==null) System.err.println("compareTo don't null");
			TestObj _t=(TestObj) o;
			return this.x-_t.x!=0?this.x-_t.x:this.y-_t.y!=0?this.y-_t.y:this.z-_t.z;
		}
		@Override
		protected Object clone(){
			try {
				return super.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				System.out.println("??");
				e.printStackTrace();
			}
			return null;
		}
	}
	public TreeSetTest() {
		// TODO Auto-generated constructor stub
	}
    static TreeSet<TestObj> tree=new TreeSet<TestObj>();
    static int count=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TestObj t_obj=new TestObj();
      t_obj.x=10;
      t_obj.y=2;
      t_obj.z=3;
      int length=10;
      TestObj[] t_Array=new TestObj[length];
      for(int i=0;i<length;i++)
      {
    	  t_Array[i]=(TestObj) t_obj.clone();
      }
      Arrays.stream(t_Array)
      .filter((aT)->{count--;aT.x=count;tree.add(aT);return true;})
      .forEach(System.out::println);
      System.out.println("--遍历Tree");
      tree.stream().forEach(System.out::println);
      
	}

}
