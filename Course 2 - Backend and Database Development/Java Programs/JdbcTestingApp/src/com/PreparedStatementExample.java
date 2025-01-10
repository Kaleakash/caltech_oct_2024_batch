package com;
import java.sql.*;
import java.util.Scanner;
public class PreparedStatementExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
	Statement stmt = con.createStatement();
	// insert query 
	PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
	System.out.println("Enter the id");
	int id = sc.nextInt();
	pstmt.setInt(1, id);		// here we set id value to 1st ? in query 
	
	System.out.println("Enter the name");
	String name = sc.next();
	pstmt.setString(2, name);	// here we set name value to 2nd ? in query 
	
	System.out.println("Enter the salary");
	float salary = sc.nextFloat();
	pstmt.setFloat(3, salary);	// here we set salary value to 3rd ? in query 
	
	int result = pstmt.executeUpdate();
	if(result>0) {
		System.out.println("Record inserted successfully");
	}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
