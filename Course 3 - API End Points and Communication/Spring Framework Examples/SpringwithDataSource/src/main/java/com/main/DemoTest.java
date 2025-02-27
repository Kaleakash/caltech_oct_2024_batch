package com.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		// load the xml file 
		ApplicationContext ac  = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee employee1 = (Employee)ac.getBean("employee");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = sc.nextInt();
		employee1.setId(id);
		System.out.println("Enter the name");
		String name = sc.next();
		employee1.setName(name);
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		employee1.setSalary(salary);
		EmployeeService es = (EmployeeService)ac.getBean("employeeService");
		String result = es.storeEmployee(employee1);
		System.out.println(result);
	}

}
