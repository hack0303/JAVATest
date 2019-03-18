package com.creating.www.i18n;

import java.io.File;
import static org.junit.Assert.*;

import java.util.Locale;
import java.util.ResourceBundle;
import org.junit.Test;


public class I18NTest {
     static org.apache.logging.log4j.Logger logger=org.apache.logging.log4j.LogManager.getLogger();
     @Test
     public void theATest(){
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
