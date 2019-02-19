package com.creating.www.i18n;

import static org.junit.Assert.*;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class I18NTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=MissingResourceException.class)
	public void test() {
		Locale en_US=new Locale("en_US");
		Locale defaultLocale=Locale.getDefault();
		System.out.println(defaultLocale.toString());
		ResourceBundle en_US_rb=ResourceBundle.getBundle("message",en_US);
		ResourceBundle defaultrb=ResourceBundle.getBundle("message",defaultLocale);
		assertEquals("hello",en_US_rb.getString("x"));
		assertEquals("你好",defaultrb.getString("x"));
		System.out.println(en_US_rb.getString("x"));
		System.out.println(en_US_rb.getString("y"));
	}

}
