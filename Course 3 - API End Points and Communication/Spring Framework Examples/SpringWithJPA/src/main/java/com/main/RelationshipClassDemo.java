package com.main;

import java.util.List;

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
	
	//	Trainer t1 = (Trainer)ac.getBean("trainer");
	//	t1.setTid(3);
	//	t1.setTname("Lex");
	//	t1.setTech("AI");
	//	String result = ts.storeTrainer(t1);
	//	System.out.println(result);
	
	// store student details 
	//Student s1 = (Student)ac.getBean("student");
	//s1.setSid(103);
	//s1.setName("David");
	//s1.setAge(27);
	//s1.setTid(3);
	//	String result = ss.storeStudent(s1);
	//	System.out.println(result);
	
		// find all students 
//	List<Student> listOfStudent = ss.findAllStudent();
//	for(Student s:listOfStudent) {
//		System.out.println(s);		// it call toString method 
//	}
	
		// find all trainer 
//	List<Trainer> lisOfTrainer = ts.findAllTrainer();
//	for(Trainer t:lisOfTrainer) {
//		//System.out.println(t);   // it call toString method display all information 
//		System.out.println("Trainer name is "+t.getTname()+" Handling "+t.getListOfStudent().size()+" of student ");
//	}
	
	// retrieve trainer and student information using inner join with help of jpql query 
	List<Object[]> trainerAndStudent = ts.findTrainerAndStudentUsingJoin();
	for(Object obj[]:trainerAndStudent) {
		System.out.println("Trainer name "+obj[0]+" Technology "+obj[1]+" Student name "+obj[2]);
	}
	}

}
