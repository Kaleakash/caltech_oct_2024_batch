package com.ebank.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	static Connection con;
	// this code execute only once when the class get loaded...
	static {
		//System.out.println("Static block get called to get db connection");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");	
		} catch (Exception e) {
			System.out.println(e.toString());	
		}
	}
	
	public static Connection getDbConnection() {
		//System.out.println("static method id getDbConnection get called to get db connection");
		try {
			return con;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}
