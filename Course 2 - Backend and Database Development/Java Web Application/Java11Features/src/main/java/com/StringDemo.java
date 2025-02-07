package com;

public class StringDemo {

	public static void main(String[] args) {
	String msg = "Welcome to Java Training";	// object creation in literal style 
	String msg1 = new String("Welcome to Java Training"); // using new keyword.
	String emailid = " akash@gmail.com ";
	String info="";
	System.out.println(msg);
	System.out.println(msg1);
	System.out.println(msg1.toLowerCase());
	System.out.println(msg1.toUpperCase());
	System.out.println(emailid.length());
	System.out.println(emailid.strip().length());// remove space before as well after
	System.out.println(info.isBlank());
	System.out.println(info.length());
	msg.lines();	// converting string to stream object.
	msg.lines().forEach(e->System.out.println(e));
	}

}
