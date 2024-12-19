package com;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int result = 100/1;
			System.out.println("Result is "+result);
			System.out.println("No Exception");
		}catch(Exception e) {
			System.out.println("Catch block excecuted "+e.toString());
		}finally {
			System.out.println("Finally block excecuted");
		}
		System.out.println("Normal statement execute");
	}

}
