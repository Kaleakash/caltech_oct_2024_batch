package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DIUsingSetterBase {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("beans.xml");	
		// BeanFactory object created 
		BeanFactory factory = new XmlBeanFactory(res);
		Employee employee1 = (Employee)factory.getBean("emp3"); // parameter constructor 
		employee1.displayEmployee();
		Employee employee2 = (Employee)factory.getBean("emp4"); // it call empty constructor and using property tag override the values
		
		employee2.displayEmployee();

	}

}
