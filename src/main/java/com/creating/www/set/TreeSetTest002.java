package com.creating.www.set;

import java.util.Set;
import java.util.TreeSet;

import com.creating.www.set.TreeSetTest002.TObject;

public class TreeSetTest002 {

	public TreeSetTest002() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Set<TObject> tos=new TreeSet<TObject>();
		TObject tobj=new TObject();
		tobj.index=0;
		tobj.x=1;
		tobj.y=1;
		tos.add(tobj);
		tobj=new TObject();
		tobj.index=1;
		tobj.x=1;
		tobj.y=1;
		tos.add(tobj);
		System.out.println(tos);
		tobj=new TObject();
		tobj.index=1;
		tobj.x=1;
		tobj.y=1;
		System.out.println(tos.contains(tobj));
		System.out.println(((TreeSet<TObject>)tos).first());

	}
	public static class TObject implements Comparable<Object>
	{
		public int index;
        public int x;
        public int y;
		@Override
		public int compareTo(Object o) {
			TObject other = (TObject) o;
			return this.index-other.index;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + index;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			TObject other = (TObject) obj;
			if(this.x==other.x&&(this.y==other.y)) 
		     return true;
			return false;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.index+":"+this.x+":"+this.y;
		}
	}

}
