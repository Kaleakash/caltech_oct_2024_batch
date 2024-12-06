
public class TypeCastingExample {

	public static void main(String[] args) {
	// int family 
	byte a=10;
	short b=a;			// implicit type casting 
	System.out.println("a "+a);
	System.out.println("b "+b);
	short c=10;
		byte d = (byte)c;		// explicit type casting 
	System.out.println("c "+c);
	System.out.println("d "+d);
	// int to float 
	int m=10;
	float n=m;			// implicit type casting 
	System.out.println("m "+m);
	System.out.println("n "+n);
	float o=10;
		int p=(int)o;			// explicit type casting 
	System.out.println("o "+o);
	System.out.println("p "+p);
	}

}
