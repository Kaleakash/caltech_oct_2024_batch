package com;

import java.util.Scanner;

public class ThrowExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		try {
		if(age<0) {
			//throw new Exception();
			throw new Exception("Age must be +ve");
		}else {
			System.out.println("Your age is "+age);
		}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("finish");
	}

}
