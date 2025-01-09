package com;
import java.sql.*;
public class JdbcTest {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
	System.out.println("Connected successfully");
	Statement stmt = con.createStatement();
		// Insert Query 
		
//		int result = stmt.executeUpdate("insert into employee values(2,'John',25000)");
//		if(result>0) {
//			System.out.println("Record inserted successfully");
//		}
		
		// Update Query 
		
//		int result = stmt.executeUpdate("update employee set salary=48000 where eid=2");
//		if(result>0) {
//			System.out.println("Record updated successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
		// Delete Query 
		int result = stmt.executeUpdate("delete from employee where eid=2");
		if(result>0) {
			System.out.println("Record deleted successfully");
		}else {
			System.out.println("Record not present");
		}
		
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
