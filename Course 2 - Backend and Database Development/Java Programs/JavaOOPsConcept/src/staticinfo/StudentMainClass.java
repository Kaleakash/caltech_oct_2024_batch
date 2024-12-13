package staticinfo;

public class StudentMainClass {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.sname="Aidan";
		s2.sname="Jun";
		
		Student.tname="Akash";
		s1.tname="Steven";
		s2.tname="John";
		Student.tname="Neena";
		
		s1.displayStudentInfo();
		s2.displayStudentInfo();

	}

}
