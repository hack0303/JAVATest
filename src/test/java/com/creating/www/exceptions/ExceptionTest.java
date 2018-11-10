package com.creating.www.exceptions;

public class ExceptionTest {

	public ExceptionTest() {
		// TODO Auto-generated constructor stub
	}
	private static class TestException extends Exception
	{
		private String message;
		public TestException(String message) {
			this.message=message;
		}
		public String getMessage() {
			return this.message;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {throw new TestException("text");}
         catch(TestException e) 
         {
        	 System.out.println(e.getMessage());
         }
         catch(Exception e) 
         {System.out.println(e.getMessage());}
	}

}
