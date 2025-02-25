package com;

public class Employee {
private int id;
private String name;
private float salary;
	
	// empty constructor 
	public Employee() {
		System.out.println("object created using empty constructor...");
	}

	// parameter constructor 
	public Employee(int id, String name, float salary) {
		super();
		System.out.println("object created using parameter constructor...");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


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

	public void displayEmployee() {
		System.out.println("This is Employee class method");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
