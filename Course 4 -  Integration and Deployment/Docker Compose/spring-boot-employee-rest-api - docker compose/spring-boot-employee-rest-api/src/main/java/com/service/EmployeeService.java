package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public String storeEmployeeDetails(Employee employee) {
		Optional<Employee> result	= employeeRepository.findById(employee.getId());
		if(result.isPresent()) {
			return "Employee id must be unique";
		}else {
			employeeRepository.save(employee);
			return "Employee record stored successfully";
		}	
	}
	
	public String updateEmployeeSalary(Employee employee) { // id and salary 
		Optional<Employee> result	= employeeRepository.findById(employee.getId());
		if(result.isPresent()) {
			Employee emp = result.get();    // emp hold data from db. 
			emp.setSalary(employee.getSalary());  // we replace old salary by new salary
			employeeRepository.saveAndFlush(emp);
			return "Employee salary updated successfully";
		}else {

			return "Employee not present";
		}	
	}
	
	public String deleteEmployee(int id) { // id and salary 
		Optional<Employee> result	= employeeRepository.findById(id);
		if(result.isPresent()) {
			employeeRepository.deleteById(id);
			return "Employee record deleted successfully";
		}else {

			return "Employee not present";
		}	
	}
	
}
