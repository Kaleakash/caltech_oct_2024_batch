package com;

public class CheckedException {

	public static void main(String[] args) throws Exception{
		System.out.println("Hi");
		System.out.println("Welcome");
		try {
		Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("Tomorrow we are going to learn Multi threading");
	}

}
