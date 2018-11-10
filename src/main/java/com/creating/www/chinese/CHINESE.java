package com.creating.www.chinese;

public class CHINESE {

	public CHINESE() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str1="#\u65E5\u5FD7\u6253\u5370\u95F4\u9694\u65F6\u95F4";
      String str2="#日志打印间隔时间";
	System.out.println(str1);
	System.out.println(str2);
	char[] cs=str2.toCharArray();
	for(char c:cs) 
	{
		System.out.println("\\u"+Integer.toHexString(c));	
	}
	}

}
