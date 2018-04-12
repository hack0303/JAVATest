/**
 * 
 */
package com.creating.www.clone;

/**
 * @author Administrator
 *
 */
public class Test001 implements Cloneable {
private int x=10086;
	/**
	 * 
	 */
	public Test001() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public int getX() {
		return x;
	}

}
