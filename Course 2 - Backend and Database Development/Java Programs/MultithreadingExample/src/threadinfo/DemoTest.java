package threadinfo;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1  = new A();	// obj1 is a thread class reference or object. 
		B obj2 = new B();
		
		obj1.start();		// ready to run 
		
		obj2.start();		// ready to run 
	}

}
