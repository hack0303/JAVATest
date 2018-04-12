package com.creating.www.equals;

public class B {
   private int x;
   private int y;
	public B() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
	return 1;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	@Override
    public boolean equals(Object o){
		boolean flag=false;
		if(o instanceof B){
		 if(this.x==((B)o).getX()||this.y==((B)o).getX()){
			 return true;
		 }	
		}	
		return flag;
    }
}
