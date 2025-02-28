package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		// load the xml file 
		ApplicationContext ac  = new ClassPathXmlApplicationContext("beans.xml");
		Scanner sc = new Scanner(System.in);
		EmployeeService es = (EmployeeService)ac.getBean("employeeService");
		String con ="";
		int choice;
		int id;
		String name;
		float salary;
		String result;
		do {
			System.out.println("1:Add Employee 2 :Delete Employee 3 :Update Employee"
					+ "4: Retrieve Employee details as Map");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter the id");
					id = sc.nextInt();
					System.out.println("Enter the name");
					name = sc.next();
					System.out.println("Enter the salary");
					salary = sc.nextFloat();
				
					Employee employee1 = (Employee)ac.getBean("employee");
					employee1.setId(id);
					employee1.setName(name);
					employee1.setSalary(salary);
					result = es.storeEmployee(employee1);
					System.out.println(result);
					break;
			case 2:System.out.println("Enter the employee id to delete the record");
			       id = sc.nextInt();
			       result = es.deleteEmployee(id);
			       System.out.println(result);
			       break;
			case 3:System.out.println("Enter the id");
					id = sc.nextInt();
					System.out.println("Enter the name");
					name = sc.next();
					System.out.println("Enter the salary");
					salary = sc.nextFloat();
		
					Employee employee2 = (Employee)ac.getBean("employee");
					employee2.setId(id);
					employee2.setName(name);
					employee2.setSalary(salary);
					result = es.updateEmployee(employee2);
					System.out.println(result);
					break;
			case 4:System.out.println("All Employee details as Map");
			    List<Map<String, Object>> employeeMaps= es.getEmployeeAsMap();
			    Iterator<Map<String, Object>> li = employeeMaps.iterator();
			    while(li.hasNext()) {
			    	Map<String, Object> mm = li.next();
			   System.out.println(mm.get("id")+" "+mm.get("name")+" "+mm.get("salary"));
			    }
			    break;
			default:System.out.println("Wrong choice");
				break;
			}
			System.out.println("Do you want to continue(y/n)");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank you!");
	}

}
