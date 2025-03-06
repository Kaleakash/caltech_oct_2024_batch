package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
	
	// store Employee 
	Employee employee1 = (Employee)ac.getBean("employee");
	employee1.setId(104);
	employee1.setName("John");
	employee1.setSalary(54000);
	String result = es.storeEmployee(employee1);
	System.out.println(result);
	}

}
