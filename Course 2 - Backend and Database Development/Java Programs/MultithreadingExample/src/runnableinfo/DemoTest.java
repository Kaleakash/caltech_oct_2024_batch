package runnableinfo;

public class DemoTest {

	public static void main(String[] args) {
		C obj1 = new C();
		D obj2 = new D();
		
		Thread t1 = new Thread(obj1);	// t1
		Thread t2 = new Thread(obj2);	// t2 are thread object
		
		t1.start();
		t2.start();
	}

}
