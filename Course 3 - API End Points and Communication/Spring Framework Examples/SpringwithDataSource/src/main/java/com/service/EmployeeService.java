package com.service;

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

}
