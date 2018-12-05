package com.creating.www.packagi;

import static org.junit.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.junit.Test;

public class PackageTest {
@Test
public void test001() 
{
	Package a=PackageTest.class.getPackage();
	System.out.println(a.getImplementationTitle());
	System.out.println(a.getSpecificationTitle()+" "+a.getSpecificationVersion());
	InputStream is=PackageTest.class.getClassLoader().getResourceAsStream("META-INF/MANIFEST.MF");
	try {
		/**
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String line=null;
		while((line=br.readLine())!=null) 
		{
			System.out.println(line);
		}
		*/
		Manifest mf=new Manifest();
		mf.read(is);
		assertNotNull(mf.getMainAttributes());
		Map<String, Attributes> map=mf.getEntries();
		for(Map.Entry<String, Attributes> e:map.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		System.out.println(mf.getAttributes("Manifest-Version"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
