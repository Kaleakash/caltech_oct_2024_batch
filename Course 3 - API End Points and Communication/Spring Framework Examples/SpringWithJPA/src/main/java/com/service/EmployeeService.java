package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public String storeEmployee(Employee employee) {
		if(employeeDao.storeEmployee(employee)>0) {
			return "Employee record stored successfully";
		}else {
			return "Employee record didn't store";
		}
	}
	
	public String deleteEmployee(int id) {
		if(employeeDao.deleteEmployee(id)>0) {
			return "Employee record deleted successfully";
		}else {
			return "Employee record not present";
		}
	}
	public String updateEmployeeSalary(Employee emp) {
		if(employeeDao.updateEmployeeSalary(emp)>0) {
			return "Employee record updated";
		}else {
			return "Employee record not present";
		}
	}
	
	public Employee findEmployee(int id) {
		return employeeDao.findEmployee(id);
	}
	
	public List<Employee> findAllEmployees() {
		return employeeDao.findAllEmployees();
	}
	
	public List<Employee> findEmployeeWithSalaryCondition(float salary){
		return employeeDao.findEmployeeWithSalaryCondition(salary);
	}
	
	public List<String> findAllEmployeeNames() {
		return employeeDao.findAllEmployeeNames();
	}
	
	public List<Float> findAllEmployeeSalary() {
		return employeeDao.findAllEmployeeSalary();
	}
	
	public List<Object[]> findNameAndSalary() {
		return employeeDao.findAllEmployeeNameAndSalary();
	}
}
