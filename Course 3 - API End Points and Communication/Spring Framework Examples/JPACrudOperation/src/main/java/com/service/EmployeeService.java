package com.service;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {

	EmployeeDao ed = new EmployeeDao();
	public String storeEmployee(Employee employee) {
		if(ed.storeEmployee(employee)>0) {
			return "Employee record stored";
		}else {
			return "Employee record didn't store";
		}
	}
}
