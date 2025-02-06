package info;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListDetails {

	public static void main(String[] args) {
	// List of names 
		List<String> names = new ArrayList<String>();
		names.add("Ravi"); names.add("Steven"); names.add("John"); names.add("Neena");
		System.out.println(names);
		// retrieve names one by one
		System.out.println("Retrieve names one by one");
		Iterator<String> li = names.iterator();
		while(li.hasNext()) {
			String name = li.next();
			System.out.println(name);
		}
		System.out.println("using consumer we display the value");
		Consumer<String> cc  = new MyConsumer();
		names.forEach(cc);
		System.out.println("using lambda");
		
		names.forEach((name)->System.out.println("name is "+name));
	}

}


