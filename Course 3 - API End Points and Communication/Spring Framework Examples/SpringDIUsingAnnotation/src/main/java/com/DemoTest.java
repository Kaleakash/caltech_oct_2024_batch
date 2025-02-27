package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Resource res = new ClassPathResource("beans.xml");	
		// BeanFactory object created 
		//BeanFactory factory = new XmlBeanFactory(res);
		// load the xml file as well as get the reference of ApplicationContext 
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	Address add = (Address)ac.getBean("address");
	System.out.println(add.toString());// default value of city and state 
	add.setCity("San Diego");
	add.setState("California");
	System.out.println(add);	// by default it call toString method
	Employee emp = (Employee)ac.getBean("employee");
	System.out.println(emp);
	emp.setId(100);
	emp.setName("Steven");
	emp.setSalary(45000);
	emp.setAdd(add);
	System.out.println(emp);
	}

}
