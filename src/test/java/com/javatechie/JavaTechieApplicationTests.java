package com.javatechie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaTechieApplicationTests {

	Logger logger = LoggerFactory.getLogger(JavaTechieApplicationTests.class);
	@Test
	public  contextLoads() {
		logger.info("Test Case Executing...");
		logger.info("Test Case Executing second time...");
		assertEquals(true,true);
	}

}
