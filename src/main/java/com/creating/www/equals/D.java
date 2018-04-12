package com.creating.www.equals;

public class D {
   private int x;
   private int y;
	public D() {
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
		if(o instanceof C){
		 if(this.x==((D)o).getX()||this.y==((D)o).getX()){
			 return true;
		 }	
		}	
		return flag;
    }
}
