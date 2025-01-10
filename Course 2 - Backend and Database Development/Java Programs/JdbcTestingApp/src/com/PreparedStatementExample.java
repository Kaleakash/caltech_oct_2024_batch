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
	System.out.println("1:Add Emmployee 2 : Delete Employee 3 : Update Employee 4 : Retrieve Employee");
	System.out.println("plz enter your choice");
	int choice = sc.nextInt();
	
	if(choice==1) {
		
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
		
	}else if(choice==2) {
		
		PreparedStatement pstmt = con.prepareStatement("delete from employee where eid = ?");
		System.out.println("Enter the id");
		int id = sc.nextInt();
		pstmt.setInt(1, id);		// here we set id value to 1st ? in query 
	
	
		int result = pstmt.executeUpdate();
		if(result>0) {
			System.out.println("Record deleted successfully");
		}else {
			System.out.println("Record not present");
		}
		
	}else if(choice==3) {
		
		
		PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where eid=?");
		System.out.println("Enter the id");
		int id = sc.nextInt();
		pstmt.setInt(2, id);		// here we set id value to 2nd ? in query 
	
		
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		pstmt.setFloat(1, salary);	// here we set salary value to 1st ? in query 
	
		int result = pstmt.executeUpdate();
		if(result>0) {
			System.out.println("Record updated successfully");
		}else {
			System.out.println("Record not present");
		}
		
	}else if(choice==4) {
		
		PreparedStatement pstmt = con.prepareStatement("select * from employee where salary > ?");
		
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		pstmt.setFloat(1, salary);	// here we set salary value to 1st ? in query 
	
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println("Id is "+rs.getInt("eid")+" Name is "+rs.getString("ename")+" Salary is "+rs.getFloat("salary"));
		}
		
	}else {
		System.out.println("wrong choice");
	}
	
	
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
