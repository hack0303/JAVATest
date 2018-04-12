package com.creating.www.bean008;

public class TestAnnotation002 {
/**
 *hello
 * 
 */
	public TestAnnotation002() {
		// TODO Auto-generated constructor stub
	}
	/**
	 *@param  
	 *@return {@value 值},类型为 TestAnnotation001
	 *@see {@link com.creating.www.bean008.TestAnnotation001}
	 * 
	 * */
    public TestAnnotation001 test(){
    	return new TestAnnotation001();
    }
}
