package com;

public class VarLocalVariable {

	public static void main(String[] args) {
	int a=10;
	String name = "Steven";
	var fname= "Raj Deep";	// it consider string type
	fname = "Raj Kumar";
	var age = 25;				// it consider number type
	//age="John";
	System.out.println(a);
	System.out.println(name);
	System.out.println(fname);
	System.out.println(age);
	// java 8 
	LoginDetails resul1 = (String emailid,String password)->emailid.equals("akash@gmail.com") && password.equals("123");
	System.out.println(resul1.checkLoginDetails("akash@gmail.com","123"));
	
	// java 11 
	LoginDetails resul2 = (var emailid,var password)->emailid.equals("akash@gmail.com") && password.equals("123");
	System.out.println(resul2.checkLoginDetails("akash@gmail.com","1235"));
	}

}
