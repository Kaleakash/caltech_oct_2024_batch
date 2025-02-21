package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

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
		
		Employee employee1 = (Employee)fatory.getBean("emp1");
		employee1.displayEmployee();
		
		Employee employee2 = (Employee)fatory.getBean("emp1");
		employee2.displayEmployee();
	}

}
