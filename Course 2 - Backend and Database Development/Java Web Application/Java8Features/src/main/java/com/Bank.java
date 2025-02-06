package com;

public interface Bank {
public void withdraw();
public void deposit();			// abstract methods 
public default void findBalance(int accno) {		// this method can be override 
	System.out.println("default find balance implementation");
}
public static void roi() {					// this method can't override 
	System.out.println("static rate of interest implementation ");
}
}
