package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListExample {

	public static void main(String[] args) {
//		// 1st Example 
//		String names[]={"Ravi","Ramesh","Ajay","Vikash"};
//		System.out.println(names);
//		for(String name:names) {
//			System.out.println(name);
//		}
//		
//		ArrayList al = new ArrayList();
//		al.add("Ravi");				// 0 index position 
//		al.add("Ramesh");			// 1 index position 
//		al.add("Ajay");				// 2 index position 
//		al.add("Vikash");
//		System.out.println(al);   // display whole object as a string 
//		al.remove(1);		// remove element using index position 
//		al.remove("Ajay");	// remove using value
//		System.out.println(al);
//		al.add(1, "Steven");		// add the element in 1 index position. 
//		System.out.println(al);
//		System.out.println("Search "+al.contains("Steven"));
//		System.out.println("Search "+al.contains("John"));
		
		// 2nd Example 
//		LinkedList al = new LinkedList();
//		al.add("Ravi");				
//		al.add("Ramesh");			
//		al.add("Ajay");				 
//		al.add("Vikash");
//		System.out.println(al);   // display whole object as a string 
//		al.remove(1);		// remove element using index position 
//		al.remove("Ajay");	// remove using value
//		System.out.println(al);
//		al.add(1, "Steven");		// add the element in 1 index position. 
//		System.out.println(al);
//		System.out.println("Search "+al.contains("Steven"));
//		System.out.println("Search "+al.contains("John"));
//		System.out.println("First node element "+al.getFirst());
//		System.out.println("Last node element "+al.getLast());
		
		// 3rd Example 
		
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println(ss);    // display the output as string format. 
		System.out.println("Pop "+ss.pop());  // remove from stack ie 400 
		System.out.println(ss);    // display the output as string format. 
		System.out.println("Peek "+ss.peek());  // display top most element ie 300 
		System.out.println(ss);    // display the output as string format. 
		System.out.println("Search "+ss.search(300));	// display element position start from top 
		System.out.println("Search "+ss.search(200));
		System.out.println("Search "+ss.search(800));	// if not present return -1
	}

}
