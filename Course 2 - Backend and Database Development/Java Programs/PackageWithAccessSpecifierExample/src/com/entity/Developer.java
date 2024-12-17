package com.entity;
import com.bean.Employee;

public class Developer extends Employee{

	public void displayDeveloper() {
		//System.out.println("id is "+this.id); // same class 
		//System.out.println("name is "+this.name);	// different package 
		System.out.println("salary is "+this.salary);
		System.out.println("desg is "+this.designation);
	}
}
