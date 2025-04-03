package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bean.CabFare;

@SpringBootTest
class CabFareServiceTest {

	@Autowired
	CabFareService cabFareService;
	
	@Test
	//@Disabled
	void testStoreCabFareInfo() {
		CabFare cf = new CabFare();
		cf.setSource("A");
		cf.setDestination("B");
		cf.setFare(10);
		String result = cabFareService.storeCabFareInfo(cf);
		assertEquals("Car Fare Information stored", result);
	}

	@Test
	@Disabled
	void testFindFare() {
	float fare1 = cabFareService.findFare("A", "B");
	assertEquals(10.0, fare1,2);		// 3rd parameter after decimal 2 point 
	
	float fare2 = cabFareService.findFare("B", "C");
	assertEquals(20.0, fare2);
	//assertEquals(null, null);
	}

}
