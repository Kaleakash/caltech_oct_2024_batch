package com;
import java.sql.*;
public class JdbcTest {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
