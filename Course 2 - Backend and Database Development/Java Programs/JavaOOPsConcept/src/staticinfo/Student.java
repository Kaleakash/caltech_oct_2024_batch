package staticinfo;

public class Student {
String sname;				// object level 
static String tname;		// class level 

public void displayStudentInfo() {
	System.out.println("Student name "+sname);
	System.out.println("Trainer name "+tname);
}
}
