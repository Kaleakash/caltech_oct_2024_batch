package com.main;

import java.util.Scanner;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	EmployeeService es = new EmployeeService();
	String result;
	System.out.println("1:Add Employee 2:Delete Employee 3 :Update Employee 4 :Retrieve Employee");
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
	if(choice==2) {
		System.out.println("Enter the id");
		int id = sc.nextInt();
		result = es.deleteEmployee(id);
		System.out.println(result);
	}

	if(choice==3) {
			System.out.println("Enter the id");
			int id = sc.nextInt();
			
			System.out.println("Enter the salary");
			float salary = sc.nextFloat();
			Employee emp = new Employee();
			emp.setId(id);
			
			emp.setSalary(salary);
			result = es.updateEmployee(emp);
					System.out.println(result);
	}
	if(choice==4) {
		System.out.println("Enter the id");
		int id = sc.nextInt();
		Employee emp=es.findEmployee(id);
		System.out.println(emp);
	}
	}

}
