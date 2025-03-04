package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bean.Employee;

public class EmployeeDao {
	
	public int storeEmployee(Employee employee) {
		// it load persitene.xml file and get database as well as entity class details using persistence unit name 
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaDemo");	 // like a Connection 
		// it is like a PreparedStatement which contains set of method 
		// which help to do operation on entity
		EntityManager manager = emf.createEntityManager();		// like a PreparedStatement 
		
		
		// get the transaction object. 
		EntityTransaction tran = manager.getTransaction();
		
		try {
		tran.begin();
		// save the object in database.
			manager.persist(employee);								//  insert query or save the object. 
			
		tran.commit();
		
		return 1;
		}catch(Exception e) {
			tran.rollback();
			return 0;
		}
		
	}
	

	public int deleteEmployee(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaDemo");	 // like a Connection 
		EntityManager manager = emf.createEntityManager();		// like a PreparedStatement 
		EntityTransaction tran = manager.getTransaction();
		Employee emp = manager.find(Employee.class, id);
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
			manager.remove(emp);		// delete query
			tran.commit();
			return 1;
		}
		
	}
	
	public int updateSalary(Employee emp) {	// id and salary
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaDemo");	 // like a Connection 
		EntityManager manager = emf.createEntityManager();		// like a PreparedStatement 
		EntityTransaction tran = manager.getTransaction();
		Employee employee = manager.find(Employee.class, emp.getId());
		if(employee==null) {
			return 0;
		}else {
			tran.begin();
				employee.setSalary(emp.getSalary());  // replace new salary
				manager.merge(employee);				// update new salary in existing objects. 
			tran.commit();
			return 1;
		}
		
	}
	
	public Employee findEmployee(int id) {	// id and salary
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaDemo");	 // like a Connection 
		EntityManager manager = emf.createEntityManager();		// like a PreparedStatement 
		Employee employee = manager.find(Employee.class, id);
		return employee;
		
	}
}
