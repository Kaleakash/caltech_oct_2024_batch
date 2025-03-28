package com.service;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.bean.Employee;

public class EmployeeServiceTest {

	@Test
	@Ignore
	public void testGetEmployee() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		Employee emp = es.getEmployee();
		assertNotNull(emp);    // we expect object not null. 
		assertEquals(100, emp.getId());
		assertEquals("Steven", emp.getName());
		assertEquals(34000, emp.getSalary(),2);
	}

	@Test
	public void testGetAllEmployee() {
		
	}

	@Test
	@Ignore
	public void testCheckLoginDetails() {
		
	}

}
