package com.service;
import com.bean.Employee;

public class EmployeeService {

	Employee emp = new Employee();
	public void display() {
		//System.out.println("id is "+emp.id); // private 
		//System.out.println("name is "+emp.name); // default within same package 
		//System.out.println("Salary is "+emp.salary); // protected not a sub class
		System.out.println("Design is "+emp.designation);
	}
}
