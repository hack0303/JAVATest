package com.creating.www.refelect;

import java.lang.reflect.Method;

import org.junit.Test;

public class ListMethodTest {

	@Test
	public void test001() 
	{Class<BeanDisplayer> clazz=null;
		try {
			clazz=(Class<BeanDisplayer>) Class.forName("com.creating.www.refelect.BeanDisplayer");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(clazz!=null) 
		{
			Method[] methods=clazz.getDeclaredMethods();
			for(Method m:methods) 
			{
				System.out.println(m.getName());
				Class<?>[] paramtypes=m.getParameterTypes();
				if(paramtypes==null) System.out.println("异常");
				else 
				{
					if(paramtypes.length==0) System.out.println("无参数");
					else
					for(Class<?> paramtype:paramtypes) 
					{
						System.out.println(paramtype.getName());
					}
				}
				System.out.println("------------");
			}
		}
		System.out.println(clazz.isInstance(new Integer(37)));
		System.out.println(clazz.isInstance(new BeanDisplayer()));
	}
}
