package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;

public class EmployeeService {
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Steven");
		emp.setSalary(34000);
		return emp;
	}
	
	public List<Employee> getAllEmployee() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Steven");
		emp.setSalary(34000);
		
		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("John");
		emp1.setSalary(36000);
		listOfEmp.add(emp);
		listOfEmp.add(emp1);
		return listOfEmp;
	}
	
	public boolean checkLoginDetails(String emailid, String password) {
		// we can check from db. 
		if(emailid.equals("admin@gmail.com") && password.equals("admin@123")) {
			return true;
		}else {
			return true;
		}
	}
}
