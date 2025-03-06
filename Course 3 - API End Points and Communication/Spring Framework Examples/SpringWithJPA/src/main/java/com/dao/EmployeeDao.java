package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	EntityManagerFactory emf;
	// Store Employee 
	public int storeEmployee(Employee employee) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(employee);			
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	// Delete Employee using id 
	public int deleteEmployee(int id) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Employee emp = manager.find(Employee.class, id);// find record using pk property 
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
				manager.remove(emp);				// delete query 
			tran.commit();
			return 1;
		}
	}
	
	// update employee salary using id 
	public int updateEmployeeSalary(Employee employee) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Employee emp = manager.find(Employee.class, employee.getId());//
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
				emp.setSalary(employee.getSalary());  // replace new salary 
				
				manager.merge(emp);  					// update query 
			tran.commit();
			return 1;
		}
	}
	
	// find Employee using id 
	public Employee findEmployee(int id) {
		EntityManager manager = emf.createEntityManager();
		Employee emp = manager.find(Employee.class, id);
		return emp;
	}
	
	// find All record using JPQL language 
	public List<Employee> findAllEmployees() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select e from Employee e");
		List<Employee> listOfEmp= qry.getResultList();
		return listOfEmp;
	}
	
	// find record with conditions. 
	public List<Employee> findEmployeeWithSalaryCondition(float salary){
		EntityManager manager = emf.createEntityManager();
		// label query which is use to set the dynamic value 
		Query qry = manager.createQuery("select e from Employee e where e.salary > :esalary");
		// esalary is label name
		qry.setParameter("esalary", salary);
		List<Employee> listOfEmp= qry.getResultList();
		return listOfEmp;
	}
}





