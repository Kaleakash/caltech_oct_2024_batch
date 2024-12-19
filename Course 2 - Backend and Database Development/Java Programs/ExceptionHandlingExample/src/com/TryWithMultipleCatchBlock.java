package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		
		try {
			
		}
		catch(ArithmeticException e) {
			System.out.println("Divided by Zero "+e.toString());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index "+e.toString());	// exception name with message 
		}catch(Exception e) {
			System.out.println("Generic Exception "+e.toString());
		}
		
		System.out.println("Finish");
	}

}
