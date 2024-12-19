package com;

public class RunTimeError {

	public static void main(String[] args) {
	System.out.println("Hi");
	int a=10;
	int b=0;
	int num[]= {10,20,30,40,50};
		try {
		int result = a/b;
		System.out.println("Result is "+result);
		int result1 = num[6];
		System.out.println("Result is "+result1);
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			//System.out.println(e.getMessage());  // display short message
			System.out.println(e.toString());  // name of the exception with message
		}
		
	System.out.println("Bye..");
	System.out.println("Bye..");
	System.out.println("Bye..");
	}

}
