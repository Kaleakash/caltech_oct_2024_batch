package staticinfo;

public class StaticExample {

	public static void main(String[] args) {
		System.out.println("Static example");
//		Employee emp1 = new Employee();	// heap memory 
//		Employee emp2 = new Employee();	// heap memory 
//		emp1.id=100;
//		emp2.id=200;
//		emp1.mgrid=1;
//		emp2.mgrid=2;
//		Employee.mgrid=3;
//		emp1.displayEmpInfo();  // id =100, mgrid=3
//		emp2.displayEmpInfo();  // id =200,mgrid=3
		Employee.globalLogin();
	}

}
