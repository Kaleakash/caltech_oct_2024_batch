package com.main;

import java.util.Scanner;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	EmployeeService es = new EmployeeService();
	String result;
	System.out.println("1:Add Employee");
	int choice = sc.nextInt();
	if(choice==1) {
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		result = es.storeEmployee(emp);
				System.out.println(result);
	}

	}

}
