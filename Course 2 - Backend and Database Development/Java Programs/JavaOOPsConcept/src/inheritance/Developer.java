package inheritance;

public class Developer extends Employee{
	private String projectName;
	
	public void readDeveloper() {
		System.out.println("Enter the Project Name");
		this.projectName=sc.next();
	}
	
	public void disDeveloper() {
		System.out.println("Project Name is "+this.projectName);
	}
}
