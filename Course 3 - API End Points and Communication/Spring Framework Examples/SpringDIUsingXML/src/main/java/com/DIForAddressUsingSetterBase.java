package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DIForAddressUsingSetterBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the xml file 
				Resource res = new ClassPathResource("beans.xml");	
				// BeanFactory object created 
				BeanFactory factory = new XmlBeanFactory(res);
	Address address1  = (Address)factory.getBean("add1");
	System.out.println(address1.toString());
	
	Address address2  = (Address)factory.getBean("add2");
	System.out.println(address2.toString());
	
	}

}
