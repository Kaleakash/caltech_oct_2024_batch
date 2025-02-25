package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DIUsingEmptyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// according to core java we need to create the object 
		// call method 
		//Employee emp1 = new Employee();
		//emp1.displayEmployee();
		
		// load the xml file 
		Resource res = new ClassPathResource("beans.xml");	
		// BeanFactory object created 
		BeanFactory fatory = new XmlBeanFactory(res);
		
		// 1st example 
		
		System.out.println("object creation with singleton as well as prototype");
		
		Employee employee1 = (Employee)fatory.getBean("emp1");		// it call constructor 
		employee1.displayEmployee();
		
		Employee employee2 = (Employee)fatory.getBean("emp1");		// it call constructor 
		employee2.displayEmployee();
		System.out.println("------------------------------");
		
		Employee employee3 = (Employee)fatory.getBean("emp2");		// first time , it call constructor 
		employee3.displayEmployee();
		
		Employee employee4 = (Employee)fatory.getBean("emp2");		// it provide same memory. 
		employee4.displayEmployee();
		
	
	
	}

}
