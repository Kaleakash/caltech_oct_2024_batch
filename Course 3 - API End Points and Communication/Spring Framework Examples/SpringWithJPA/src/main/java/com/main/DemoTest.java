package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
	
	// store Employee 
//	Employee employee1 = (Employee)ac.getBean("employee");
//	employee1.setId(104);
//	employee1.setName("John");
//	employee1.setSalary(54000);
//	String result = es.storeEmployee(employee1);
//	System.out.println(result);
	
	// Delete employee 
//	String result = es.deleteEmployee(101);
//	System.out.println(result);
	
//	// Update Employee 
//	Employee employee1 = (Employee)ac.getBean("employee");
//	employee1.setId(102);
//	employee1.setSalary(25000);
//	String result = es.updateEmployeeSalary(employee1);
//	System.out.println(result);
	
	// Find Employee details using id 
//	Employee emp = es.findEmployee(100);
//	if(emp==null) {
//		System.out.println("Record not present");
//	}else {
//		System.out.println(emp.toString());
//	}
	
	// retrieve All Employee using JPQL 
	List<Employee> listOfEmployee = es.findAllEmployees();
	for(Employee emp:listOfEmployee) {
		System.out.println(emp);
	}
	
	}

}
