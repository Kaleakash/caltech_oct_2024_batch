package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
public class EmployeeController {

	// format must be json or xml. 
	
	// http://localhost:8080/employee 
	
	@RequestMapping(value = "employee",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("John");
		emp.setSalary(45000);
		return emp;
	}
	
	// http://localhost:8080/employees 
	@RequestMapping(value = "employees",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee() {
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		Employee emp1 = new Employee(100,"John",45000);
		Employee emp2 = new Employee(101,"lex",42000);
		Employee emp3 = new Employee(102,"Leena",48000);
		Employee emp4 = new Employee(103,"steven",43000);
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		listOfEmployee.add(emp4);
		return listOfEmployee;
	}
	// http://localhost:8080/queryParam?name=John
	
	@RequestMapping(value = "queryParam",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String queryParamValue(@RequestParam("name") String uname) {
		// we can pass the value to service layer to get the result
		return "Welcome user using query param"+uname;
	}
	
	// http://localhost:8080/pathParam/John
	
	@RequestMapping(value = "pathParam/{name}",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String pathParamValue(@PathVariable("name") String uname) {
		// we can pass the value to service layer to get the result
		return "Welcome user using path param "+uname;
	}
}




