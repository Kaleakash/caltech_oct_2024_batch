package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloServiceTest {

	@Autowired
	HelloService helloService;
	
	@Test
	void testCheckLogin() {
		//fail("Not yet implemented");
		boolean result1 = helloService.checkLogin("akash@gmail.com", "akash@123");
		assertFalse(result1);
		
		boolean result2 = helloService.checkLogin("admin@gmail.com", "admin@123");
		assertTrue(result2);
		
	}

}
