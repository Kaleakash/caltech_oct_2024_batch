package inheritance;

import java.util.Scanner;

public class Address {
private String city;
private String state;
Scanner sc = new Scanner(System.in);

public void readAddress() {
	System.out.println("Enter the city");
	this.city = sc.next();
	System.out.println("Enter the state");
	this.state= sc.next();
}

public void disAddress() {
	System.out.println("City is "+this.city);
	System.out.println("State is "+this.state);
}
}
