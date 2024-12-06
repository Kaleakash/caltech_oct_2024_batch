
public class IfStatementExample {

	public static void main(String[] args) {
		// find the largest of two numbers 
//		int a=10,b=50;
//		if(a>b) {
//			System.out.println("Value of a is largest");
//		}else {
//			System.out.println("Value of b is largest");
//		}

		// find the largest of three numbers 
		int a=3,b=1,c=2;
		if(a>b) {
			
			if(a>c) {
				System.out.println("a is largest");
			}else {
				System.out.println("c is largest");
			}
			
		}else {
			
			if(b>c) {
				System.out.println("b is largest");
			}else {
				System.out.println("c is largest");
			}
		}
	}

}
