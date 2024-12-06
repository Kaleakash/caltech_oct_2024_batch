
public class SwithStatementExample {

	public static void main(String[] args) {
	int choice=1;
	int a=10;
	int b=5;
	int add,sub,mul,div;
	
	switch(choice) {
	case 1: add  = a+b;
			System.out.println("Add "+add);
			break;
	case 2: sub  = a-b;
			System.out.println("Sub "+sub);
			break;
	case 3: mul  = a*b;
			System.out.println("Mul "+mul);
			break;
	case 4: div  = a/b;
			System.out.println("Div "+div);
			break;
	default:System.out.println("Wrong choice");
	        break; 
	}
	
	System.out.println("finish");
	}

}
