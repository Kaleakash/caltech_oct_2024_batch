package com;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op = new Operation();
		try {
		System.out.println("Result is "+op.divide(10, 0));
		}catch(Exception e) {
			System.out.println("In main "+e.toString());
		}
		System.out.println("Done!");
	}

}
