package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
	// HashMap 
//		Map mm = new HashMap();
//		mm.put(2, "Steven");
//		mm.put(1, "John");
//		mm.put(5, "Lex");
//		mm.put(7, "Leena");
//		mm.put("Akash", "Kale");
//		mm.put("a", "b");
//		mm.put(8, "Leena");
//		mm.put(2, "Raj");		// old value replace by new value. 
//		System.out.println(mm.containsKey(2));
//		System.out.println(mm.containsValue("John"));
//		System.out.println(mm);
//		System.out.println("using key get value "+mm.get(5));
//		System.out.println("using key get value "+mm.get(50));
		
		// LinkedHashMap 
//		Map mm = new LinkedHashMap();
//		mm.put(2, "Steven");
//		mm.put(1, "John");
//		mm.put(5, "Lex");
//		mm.put(7, "Leena");
//		mm.put("Akash", "Kale");
//		mm.put("a", "b");
//		mm.put(8, "Leena");
//		mm.put(2, "Raj");		// old value replace by new value. 
//		System.out.println(mm.containsKey(2));
//		System.out.println(mm.containsValue("John"));
//		System.out.println(mm);
//		System.out.println("using key get value "+mm.get(5));
//		System.out.println("using key get value "+mm.get(50));
		
		// TreeMap 
		Map mm = new TreeMap();
		mm.put(2, "Steven");
		mm.put(1, "John");
		mm.put(5, "Lex");
		mm.put(7, "Leena");
		//mm.put("Akash", "Kale");
		//mm.put("a", "b");
		mm.put(8, "Leena");
		mm.put(2, "Raj");		// old value replace by new value. 
		System.out.println(mm.containsKey(2));
		System.out.println(mm.containsValue("John"));
		System.out.println(mm);
		System.out.println("using key get value "+mm.get(5));
		System.out.println("using key get value "+mm.get(50));
	}

}
