package staticinfo;

public class Employee {
	int id;				// number of copy base upon number of object created.
	static int mgrid;	// only one copy for mgrid
	void displayEmpInfo() {
		System.out.println("id is "+id);
		System.out.println("manager is "+mgrid);
	}
	
	static void globalLogin() {
		System.out.println("static method");
		System.out.println("Mgr id "+mgrid);
		//System.out.println("id "+id);
		//Employee emp = new Employee();
		//System.out.println("id "+emp.id);
	}
	//static abstract void info();
}
