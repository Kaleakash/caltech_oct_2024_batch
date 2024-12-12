package polymorphism;

public class MethodOverloadingExample {

	public static void main(String[] args) {
	Operation op = new Operation();

	op.add(10);
	
	op.add();
	
	op.add(100, 200);
	
	op.add(10.10f, 20.20f);
	
	op.add("10", "20");
	}

}
