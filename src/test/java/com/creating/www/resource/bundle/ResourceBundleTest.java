/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creating.www.resource.bundle;

import java.util.Locale;
import java.util.ResourceBundle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class ResourceBundleTest {
    static org.apache.logging.log4j.Logger logger=org.apache.logging.log4j.LogManager.getLogger();
    public ResourceBundleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
   static class MyClassLoader extends ClassLoader{ 
        public Class<?> findClass(String name) throws ClassNotFoundException {
        throw new ClassNotFoundException(name);
    }
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void theATest() {
        java.util.ResourceBundle rb;
        rb = java.util.ResourceBundle.getBundle(Msg.class.getName(),new Locale("en","US"));
        assertNotNull(rb);
        String key="hello";
        String v=rb.getString(key);
        assertNotNull(v);
        assertEquals("hi",v);
        logger.debug(v);
    }
}
