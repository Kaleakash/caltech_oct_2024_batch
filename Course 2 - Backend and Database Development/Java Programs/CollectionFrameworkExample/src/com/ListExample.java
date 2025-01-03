package com;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		// 1st Example 
		String names[]={"Ravi","Ramesh","Ajay","Vikash"};
		System.out.println(names);
		for(String name:names) {
			System.out.println(name);
		}
		
		ArrayList al = new ArrayList();
		al.add("Ravi");
		al.add("Ramesh");
		al.add("Ajay");
		al.add("Vikash");
		System.out.println(al);   // display whole object as a string 
		al.remove(1);		// remove element using index position 
		al.remove("Ajay");	// remove using value
		System.out.println(al);
		al.add(1, "Steven");
		System.out.println(al);
		System.out.println("Search "+al.contains("Steven"));
		System.out.println("Search "+al.contains("John"));
	}

}
