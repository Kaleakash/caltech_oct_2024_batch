package com.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class CabFareControllerTest {
	
	@Autowired
	CabFareController cabFareController;
	
	@Test
	@Disabled
	void testStoreCabFareInfo() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testFindCabFare() {
	float fareAmount = cabFareController.findCabFare("A", "B");
	assertEquals(10.0, fareAmount);
	}

}
