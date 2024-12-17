package com.main;

import com.bean.Employee;
import com.bean.Manager;
import com.entity.Developer;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.displayEmployee();
		System.out.println("-------------------");
		Manager mgr1 = new Manager();
		mgr1.displayManager();
		System.out.println("---------------------");
		Developer dev1 = new Developer();
		dev1.displayDeveloper();
		System.out.println("---------------------");
		EmployeeService es = new EmployeeService();
		es.display();
	}

}
