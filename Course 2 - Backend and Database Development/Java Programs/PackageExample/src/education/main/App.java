package education.main;
//import education.school.Attendance;	// we can use Attendance class part of school package 
//import education.school.*;		// we can use all classes or interfaces part of school package 
//import education.college.Attendance;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		education.school.Attendance att1 = new education.school.Attendance();
		att1.display();
		education.college.Attendance att2  = new education.college.Attendance();
		att2.display();
	}

}
