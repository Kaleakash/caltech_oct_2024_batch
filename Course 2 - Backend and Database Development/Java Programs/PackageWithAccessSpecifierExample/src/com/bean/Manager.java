package com.bean;

public class Manager extends Employee{

	public void displayManager() {
		//System.out.println("id is "+this.id);   // same class we can access
		System.out.println("name is "+this.name);
		System.out.println("salary is "+this.salary);
		System.out.println("desg is "+this.designation);
	}
}
