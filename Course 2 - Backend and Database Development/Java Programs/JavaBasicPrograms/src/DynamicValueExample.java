import java.util.Scanner;
public class DynamicValueExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a= sc.nextInt();		// scan int value and store in a variable
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("sum is "+sum);

	}

}
