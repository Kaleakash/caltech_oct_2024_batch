package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AutowiredExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the xml file 
				Resource res = new ClassPathResource("beans.xml");	
				// BeanFactory object created 
				BeanFactory factory = new XmlBeanFactory(res);
		Employee employee1 = (Employee)factory.getBean("emp7");
		System.out.println(employee1.toString());
	}

}
