package com;

import java.util.Scanner;

public class ThrowExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		try {
		//	int res = 100/0;
		if(age<0) {
			//throw new Exception();		// empty constructor 
			//throw new Exception("Age must be +ve");	// parameter constructor 
			//throw new AgeNegativeException();	// empty constructor 
			throw new AgeNegativeException("Age must be +ve"); // parameter constructor 
		}else {
			System.out.println("Your age is "+age);
		}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("finish");
	}

}
