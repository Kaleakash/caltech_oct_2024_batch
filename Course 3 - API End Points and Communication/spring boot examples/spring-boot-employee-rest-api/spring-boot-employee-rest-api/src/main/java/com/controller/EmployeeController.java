package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	// http://localhost:8080/findAllEmployee 
	
	@RequestMapping(value = "findAllEmployee",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployees() {
		return employeeService.findAllEmployees();
	}
	// http://localhost:8080/storeEmployee	format must be in json format  
	// data : {"id":100,"name":"John","salary":45000}
	// @RequestBody is use to extract the value from request body part. 
	@RequestMapping(value = "storeEmployee",method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeEmployee(@RequestBody Employee employee) { // map json data to object. 
		//System.out.println(employee.toString());   // calling to String method
		//return "done";		// testing 
		return employeeService.storeEmployeeDetails(employee);  // passing this value to service layer 
	}
}
