package com.creating.www.test.enumtest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EnumTest {
	static Logger logger = LogManager.getLogger(EnumTest.class.getName());

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		log("A", "B");
	}

	public static void log(String a, String b) {
		logger.entry(a, b);
		logger.trace("start");
		logger.info("nihao {}", "hehe");
		logger.trace("end");
		logger.exit();
	}

}
