package inheritance;

public class EmployeeTest {

	public static void main(String[] args) {
		// Employee class object 
		System.out.println("Enter the Employee details");
		Employee emp1 = new Employee();
		emp1.readEmployee();
		
		
		// Manager class object 
		System.out.println("Enter the Manager details");
		Manager mgr1 = new Manager();
		mgr1.readEmployee();			// read id,name,salary
		mgr1.readManager();				// read numberofEmp
		
		
		
		// Developer class object 
		System.out.println("Enter the Developer details");
		Developer dev1 = new Developer();
		dev1.readEmployee();			// read id,name,salary
		dev1.readDeveloper();				// read projectName
				
		
	
	
		System.out.println("Employee Details");
		System.out.println("--------------------------");
		emp1.displayEmployee();
		System.out.println("--------------------------");
		
		System.out.println("Manager Details");
		System.out.println("--------------------------");
		mgr1.displayEmployee();			// dis id,name,salary
		mgr1.disManager();				// dis numberOfEmp
		System.out.println("--------------------------");
		
		System.out.println("Developer Details");
		System.out.println("--------------------------");
		dev1.displayEmployee();			// dis id,name,salary
		dev1.disDeveloper();				// dis projectName
		System.out.println("--------------------------");
	}

}
