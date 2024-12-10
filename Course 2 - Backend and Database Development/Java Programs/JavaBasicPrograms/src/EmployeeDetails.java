import java.util.Scanner;
public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		float salary;
		System.out.println("Enter the id");
		id = sc.nextInt();
		System.out.println("Enter the name");
		name = sc.next();
		System.out.println("Enter the salary");
		salary = sc.nextFloat();
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}

}
