package polymorphism;

public class Operation {

	public void add() {
		System.out.println(10+20);
	}
	public void add(int x) {
		System.out.println(x+200);
	}
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	public void add(float x, float y) {
		System.out.println(x+y);
	}
	public void add(String x, String y) {
		System.out.println(x+y);
	}
}
