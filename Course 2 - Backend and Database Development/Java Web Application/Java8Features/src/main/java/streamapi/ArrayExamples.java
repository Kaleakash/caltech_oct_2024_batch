package streamapi;

import java.util.stream.Stream;

public class ArrayExamples {

	public static void main(String[] args) {
	// without Stream API 
	String names[]= {"Steven","Raj","Veer","John","Neena","Mahesh","Lokesh"};
	for(String name:names) {
		//String upperName = name.toUpperCase();
		//String lowerName = name.toLowerCase();
		//System.out.print(lowerName+" ");
		if(name.contains("ee")) {
			System.out.println(name);
		}
	}
	System.out.println("With Stream API");
	// with stream api 
	Stream<String> ss= Stream.of(names);
	//ss.forEach(name->System.out.print(name+" "));
	System.out.println("---");
	//ss.map(name->name.toLowerCase()).forEach(name->System.out.print(name+" "));
	//ss.map(str->"Welcome user "+str).forEach(name->System.out.print(name+" "));
	ss.filter(v->v.contains("ee")).forEach(name->System.out.print(name+" "));
	}

}
