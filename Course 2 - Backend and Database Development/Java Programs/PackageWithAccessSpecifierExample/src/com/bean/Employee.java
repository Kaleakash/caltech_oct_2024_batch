package com.bean;

public class Employee {
private int id=100;
String name = "Steven";			// no access specifiers ie default 
protected float salary=45000;
public String designation="Developer";

public void displayEmployee() {
	System.out.println("id is "+this.id);
	System.out.println("name is "+this.name);
	System.out.println("salary is "+this.salary);
	System.out.println("desg is "+this.designation);
}

}
