package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class RetrieveElementsFromCollectionClasses {

	public static void main(String[] args) {
		// Set Family 
		//Set hs = new HashSet();
		Set hs = new LinkedHashSet();
		hs.add(10);
		hs.add("Ravi");
		hs.add(true);
		System.out.println(hs);
		System.out.println("retrieve element one by one using for each loop");
		for(Object obj:hs) {
			System.out.println(obj);
		}
		System.out.println("retrieve the element one by one using iterator");
		Iterator li = hs.iterator();
		while(li.hasNext()) {
			Object obj = li.next();
			System.out.println(obj);
		}
		
		// List Family 
//		List ll = new ArrayList();
//		ll.add(20);
//		ll.add(10);
//		ll.add(40);
//		ll.add(30);
//		System.out.println(ll);
//		System.out.println("Retrieve each element one by one");
//		for(Object num:ll) {
//			System.out.println(num);
//		}
//		ListIterator li = ll.listIterator();
//		System.out.println("retrieve element using list iterator - forward direction");
//		while(li.hasNext()) {
//			Object obj = li.next();
//			System.out.println(obj);
//		}
//		System.out.println("retrieve element using list iterator - backward direction");
//		while(li.hasPrevious()) {
//			Object obj = li.previous();
//			System.out.println(obj);
//		}
		
		// Map family 
//		Map mm = new HashMap();
//		mm.put(1, "Steven");
//		mm.put(3, "Lex");
//		mm.put(2, "John");
//		System.out.println(mm);
//		Set ss = mm.keySet();	// it retrieve all keys from map and store in set. 
//		Iterator li = ss.iterator();
//		while(li.hasNext()) {
//			Object key = li.next();
//			System.out.println("Key "+key+"  Value "+mm.get(key));
//		}
	}

}
