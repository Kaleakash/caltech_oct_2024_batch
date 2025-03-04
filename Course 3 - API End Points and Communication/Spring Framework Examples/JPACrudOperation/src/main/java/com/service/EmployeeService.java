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
	
	public String updateEmployee(Employee employee) {
		if(ed.updateSalary(employee)>0) {
			return "Employee record updated";
		}else {
			return "Employee record not present";
		}
	}
	
	public String deleteEmployee(int id) {
		if(ed.deleteEmployee(id)>0) {
			return "Employee record deleted";
		}else {
			return "Employee record not present";
		}
	}
	public Employee findEmployee(int id) {
		return ed.findEmployee(id);
	}
}
