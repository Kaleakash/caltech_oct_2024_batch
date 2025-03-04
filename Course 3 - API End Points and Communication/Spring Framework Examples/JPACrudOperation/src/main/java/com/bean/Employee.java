package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity							// Employee class map to EMPLOYEE 
@Table(name="employee")		// if table name and class name are different 
public class Employee {
@Id									// on that variable which map to primary key columns
@Column(name="id")
private int id;
@Column(name="name")			// if column name and variable name are different 
private String name;
@Column(name="salary")
private float salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
