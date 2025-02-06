package lambda;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st approach without lamda expression 
		Hello obj1 = new HelloImp();
		obj1.sayHello();
		
		// 2nd approach with lambda expression 
		Hello obj2 = ()->System.out.println("Providing body for sayHello method with lambda style");
		obj2.sayHello();
		
		Hello obj3 = ()->System.out.println("different logic");
		obj3.sayHello();
		
		Operation op1 = (x,y)->x+y;
		System.out.println("Addition is "+op1.add(100, 200));
		
		Operation op2 = (a,b)->a+b;
		System.out.println("Addition is "+op2.add(1, 2));
		
		Operation op3 = (int m, int n)->m+n;
		System.out.println("Addition is "+op3.add(1000, 2000));
		
		Operation op4 = (int x, int y)-> {
			int sum = x+y;
			return sum;
		};
		System.out.println("Addition is "+op4.add(111,222));
	}

}
