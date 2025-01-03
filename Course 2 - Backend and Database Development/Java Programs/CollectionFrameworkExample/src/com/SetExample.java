package com;
import java.util.*;
public class SetExample {

	public static void main(String[] args) {
	// 1st Example 
//		HashSet hs1 = new HashSet();
//		System.out.println("Size "+hs1.size());
//		System.out.println("Empty "+hs1.isEmpty());
//		hs1.add(10);
//		hs1.add(10.10);
//		hs1.add("Ravi");
//		hs1.add(true);
//		hs1.add(10);
//		System.out.println(hs1);   // it display all elements as string format 
//		System.out.println("Size "+hs1.size());
//		System.out.println("Empty "+hs1.isEmpty());
//		System.out.println("Search "+hs1.contains(10));
//		System.out.println("Search "+hs1.contains(20));
//		System.out.println("Remvove "+hs1.remove("Ravi"));
//		System.out.println("Remvove "+hs1.remove("Steven"));
//		hs1.clear();
//		System.out.println("Size "+hs1.size());
//		System.out.println("Empty "+hs1.isEmpty());
		
		// 2nd Example 
//		LinkedHashSet hs1 = new LinkedHashSet();
//		System.out.println("Size "+hs1.size());
//		System.out.println("Empty "+hs1.isEmpty());
//		hs1.add(10);
//		hs1.add(10.10);
//		hs1.add("Ravi");
//		hs1.add(true);
//		hs1.add(10);
//		System.out.println(hs1);   // it display all elements as string format 
//		System.out.println("Size "+hs1.size());
//		System.out.println("Empty "+hs1.isEmpty());
//		System.out.println("Search "+hs1.contains(10));
//		System.out.println("Search "+hs1.contains(20));
//		System.out.println("Remvove "+hs1.remove("Ravi"));
//		System.out.println("Remvove "+hs1.remove("Steven"));
//		hs1.clear();
//		System.out.println("Size "+hs1.size());
//		System.out.println("Empty "+hs1.isEmpty());
		
		// 3rd Example 
		
		TreeSet hs1 = new TreeSet();
		System.out.println("Size "+hs1.size());
		System.out.println("Empty "+hs1.isEmpty());
		hs1.add(3);
		hs1.add(1);
		hs1.add(6);
		hs1.add(9);
		hs1.add(4);
		hs1.add(0);
		hs1.add(7);
		System.out.println(hs1);   // it display all elements as string format 
		System.out.println("Size "+hs1.size());
		System.out.println("Empty "+hs1.isEmpty());
		System.out.println("Search "+hs1.contains(10));
		System.out.println("Search "+hs1.contains(20));
		System.out.println("Remvove "+hs1.remove(3));
		System.out.println("Remvove "+hs1.remove(10));
		hs1.clear();
		System.out.println("Size "+hs1.size());
		System.out.println("Empty "+hs1.isEmpty());
		
	}

}
