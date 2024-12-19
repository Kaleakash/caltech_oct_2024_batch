package com;

public class ThrowsExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Operation op = new Operation();
		try {
		System.out.println("Result is "+op.divide(10, 0));
		}catch(ArithmeticException e) {
			System.out.println("In main "+e.toString());
		}
		System.out.println("Done!");
	}

}
