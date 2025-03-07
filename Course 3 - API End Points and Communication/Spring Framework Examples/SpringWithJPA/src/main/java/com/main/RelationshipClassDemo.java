package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.bean.Trainer;
import com.service.StudentService;
import com.service.TrainerService;

public class RelationshipClassDemo {

	public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	
	TrainerService ts = (TrainerService)ac.getBean("trainerService");
	StudentService ss = (StudentService)ac.getBean("studentService");
	
	// store trainer details 
	
	Trainer t1 = (Trainer)ac.getBean("trainer");
	t1.setTid(3);
	t1.setTname("Lex");
	t1.setTech("AI");
	String result = ts.storeTrainer(t1);
	System.out.println(result);
	
	// store student details 
	//Student s1 = (Student)ac.getBean("student");
	//s1.setSid(103);
	//s1.setName("David");
	//s1.setAge(27);
	//s1.setTid(3);
	
//	String result = ss.storeStudent(s1);
//	System.out.println(result);
	}

}
