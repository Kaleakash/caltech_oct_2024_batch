package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
	// Collection classes without Generics
		List ll1 = new ArrayList();
		ll1.add(10);		// auto-boxing : converting primitive to object 
		ll1.add("Ravi");
		ll1.add(true);
		ll1.add(10.20);

		Object obj=ll1.get(0);	// we get the object. 
		Integer ii = (Integer)obj;	// converting Object to Integer type ie explicit type casting 
		int n = ii.intValue();	// ii is Integer object which provided intValue method to get primitive int type 
		System.out.println(n);
		
		// Collection classes with Generics
		
		List<Integer> ll2 = new ArrayList<Integer>();
		ll2.add(10);		// auto-boxing : converting primitive to object. 
		ll2.add(20);
		ll2.add(30);
		
		int a	= ll2.get(2);	// auto-unboxing : converting object to primitive. 
		System.out.println(a);
		
		List<Object> ll3 = new ArrayList<Object>();
		ll3.add(10);
		ll3.add("Ravi");
		ll3.add(10.20);
		
	}

}
