package inheritance;

import java.util.Scanner;

public class Employee {
private int id;
private String name;
private float salary;

Scanner sc = new Scanner(System.in);

public void readEmployee() {
	System.out.println("Enter the id");
	this.id = sc.nextInt();
	System.out.println("Enter the name");
	this.name = sc.next();
	System.out.println("Enter the salary");
	this.salary=sc.nextFloat();
}

public void displayEmployee() {
	System.out.println("Id is "+this.id);
	System.out.println("Name is "+this.name);
	System.out.println("Salary is "+this.salary);
}

}
