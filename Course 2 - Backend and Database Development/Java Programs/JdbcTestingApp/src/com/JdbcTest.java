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
		
//		int result = stmt.executeUpdate("insert into employee values(4,'Neena',32000)");
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
//		int result = stmt.executeUpdate("delete from employee where eid=2");
//		if(result>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
		// Retrieve query 
		ResultSet rs = stmt.executeQuery("select * from employee");
		while(rs.next()) {	// it scan that record 
	//System.out.println(" Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
	System.out.println(" Id is "+rs.getInt("eid")+" Name is "+rs.getString("ename")+" Salary is "+rs.getFloat("salary"));
		}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
