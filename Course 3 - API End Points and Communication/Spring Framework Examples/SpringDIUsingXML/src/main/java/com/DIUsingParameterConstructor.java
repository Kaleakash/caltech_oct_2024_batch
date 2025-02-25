package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DIUsingParameterConstructor {

	public static void main(String[] args) {

				// load the xml file 
		Resource res = new ClassPathResource("beans.xml");	
				// BeanFactory object created 
		BeanFactory factory = new XmlBeanFactory(res);
		Employee employee1 = (Employee)factory.getBean("emp1");	// empty constructor with scope as prototype 
		employee1.displayEmployee();
		
		Employee employee2 = (Employee)factory.getBean("emp2"); // empty constructor with scope as singleton 
		employee2.displayEmployee();
		
		Employee employee3 = (Employee)factory.getBean("emp3"); // parameter constructor with scope as singleton 
		employee3.displayEmployee();
	}

}
