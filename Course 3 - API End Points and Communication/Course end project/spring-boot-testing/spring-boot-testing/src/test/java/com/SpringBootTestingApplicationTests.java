package com;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTestingApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);	// if result is true it pass else fail 
	}

}
