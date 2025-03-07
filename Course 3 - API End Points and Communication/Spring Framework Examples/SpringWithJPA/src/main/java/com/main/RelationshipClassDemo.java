package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Trainer;
import com.service.TrainerService;

public class RelationshipClassDemo {

	public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	TrainerService ts = (TrainerService)ac.getBean("trainerService");
	
	// store trainer details 
	Trainer t1 = (Trainer)ac.getBean("trainer");
	t1.setTid(2);
	t1.setTname("Steven");
	t1.setTech("Python");
	String result = ts.storeTrainer(t1);
	System.out.println(result);
	
	}

}
