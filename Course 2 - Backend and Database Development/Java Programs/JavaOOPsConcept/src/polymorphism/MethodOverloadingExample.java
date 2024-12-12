package polymorphism;

public class MethodOverloadingExample {

	public static void main(String[] args) {
	Operation op = new Operation();

	op.add(10);
	
	op.add();
	
	op.add(100, 200);
	
	op.add(10.100000f, 20.2000006f);
	
	op.add("10", "20");
	}

}
