package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {
	/*  create database mydb_mvc;
	 *  use mydb_mvc;
	 *  create table login(emailid varchar(30) primary key,password varchar(30));
	 */
	static Connection con;
	
	static {
		System.out.println("this code execute only once when class loaded...");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // load the driver 
			// connect the db
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb_mvc", "root", "root@123");		
		}catch(Exception e) {
			System.err.println(e.toString());
		}
	}
	
	public static Connection getDbConnection() {
		System.out.println("This method call again and again whenver we call...");
		try {
		return con;
		} catch (Exception e) {
			System.err.println(e.toString());
			return null;
		}
	}
}
