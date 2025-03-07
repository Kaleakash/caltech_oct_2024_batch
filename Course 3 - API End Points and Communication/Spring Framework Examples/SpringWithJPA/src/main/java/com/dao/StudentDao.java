package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Student;

@Repository
public class StudentDao {

	@Autowired
	EntityManagerFactory emf;
	
	public int storeStudent(Student student) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(student);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<Student> findAllStudent() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select ss from Student ss");
		List<Student> listOfStudent = qry.getResultList();
		return listOfStudent;
	}
}
