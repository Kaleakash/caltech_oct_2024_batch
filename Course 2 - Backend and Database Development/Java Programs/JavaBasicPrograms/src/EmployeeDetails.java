import java.util.Scanner;
public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int id;
//		String name;
//		float salary;
//		System.out.println("Enter the id");
//		id = sc.nextInt();
//		System.out.println("Enter the name");
//		name = sc.next();
//		System.out.println("Enter the salary");
//		salary = sc.nextFloat();
//		System.out.println("id is "+id);
//		System.out.println("name is "+name);
//		System.out.println("salary is "+salary);
		System.out.println("How many employee details do you want to store");
		int n = sc.nextInt();
		int eid[]=new int[n];
		String ename[]=new String[n];
		float esalary[]=new float[n];
		System.out.println("Enter all details one by one");
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the id");
		eid[i]=sc.nextInt();
			System.out.println("Enter the name");
		ename[i]=sc.next();
			System.out.println("Enter the salary");
		esalary[i]=sc.nextFloat();
		}
		
		// business logic 
		for(int i=0;i<n;i++) {
			esalary[i]=esalary[i]+1000;
		}
		
		// Display all Employee details;
		for(int i=0;i<n;i++) {
		System.out.println("id is "+eid[i]+" name is "+ename[i]+" salary is "+esalary[i]);
		}
	}

}
