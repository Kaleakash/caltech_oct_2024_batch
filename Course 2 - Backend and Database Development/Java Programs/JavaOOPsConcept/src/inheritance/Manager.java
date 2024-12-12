package inheritance;

public class Manager extends Employee{

private int numberOfEmp;		// primitive property or simple property : it hold only one value 
Address add = new Address();		// complex property : it can have more than one others different type of property 

public void readManager() {
	System.out.println("Enter the number of Employee working under him");
	this.numberOfEmp=sc.nextInt();
	add.readAddress(); // this code call Address class readAddress method. 
}
public void disManager() {
	System.out.println("Number of Employee working under him "+this.numberOfEmp);
	add.disAddress();
}

}
