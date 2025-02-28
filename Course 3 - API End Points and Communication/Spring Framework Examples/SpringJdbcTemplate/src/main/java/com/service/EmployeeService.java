package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service		// service layer annotation which contains business logic 
public class EmployeeService {

@Autowired
EmployeeDao employeeDao;

	public String storeEmployee(Employee employee) {
			if(employee.getSalary()<10000) {
				return "Salary must be > 10000";
			}else if(employeeDao.storeEmployee(employee)>0) {
				return "Employee record stored successfully";
			}else {
				return "Employee record dint' store";
			}
	}
	
	public String deleteEmployee(int id) {
		if(employeeDao.deleteEmployee(id)>0) {
			return "Employee record deleted successfully";
		}else {
			return "Employee record not present";
		}
	}
	public String updateEmployee(Employee employee) {
		if(employeeDao.updateEmployee(employee)>0) {
			return "Employee record updated successfully";
		}else {
			return "Employee record not present";
		}
	}
	public List<Map<String, Object>> getEmployeeAsMap() {
		return employeeDao.retrieveEmployeeAsMap();
	}
}





