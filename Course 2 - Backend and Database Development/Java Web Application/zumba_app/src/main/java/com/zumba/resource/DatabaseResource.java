package com.zumba.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseResource {

	static String url="jdbc:mysql://localhost:3306/my_zumbma_db";
	static String username="root";
	static String password="root@123";
	
	private static Connection con;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con= DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			System.err.println(e);
		}
	}
	public static Connection getDbConnection() {
		try {
			return con;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}
}
