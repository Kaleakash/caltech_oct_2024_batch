package com.ebank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ebank.bean.Account;
import com.ebank.resource.DbConnection;

public class AccountDao {

	public int createAccount(Account account) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
		Connection con = DbConnection.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into account values(?,?,?)");
		pstmt.setInt(1, account.getAccno());
		pstmt.setString(2, account.getName());
		pstmt.setFloat(3, account.getAmount());
		int result = pstmt.executeUpdate();
		return result;
		} catch (Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}
	
	
	public int withdrawn(Account account) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
			Connection con = DbConnection.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("update account set amount = amount-? where accno=?");
		pstmt.setFloat(1, account.getAmount());
		pstmt.setInt(2, account.getAccno());
		int result = pstmt.executeUpdate();	// the query effect how many record it return count. 
		return result;
		} catch (Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}
	
	public int deposit(Account account) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("update account set amount = amount+? where accno=?");
		pstmt.setFloat(1, account.getAmount());
		pstmt.setInt(2, account.getAccno());
		int result = pstmt.executeUpdate();
		return result;
		} catch (Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}
	
	public float findBalance(int accno) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select amount from account where accno=?");
		
		pstmt.setInt(1, accno);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			float balance = rs.getFloat("amount");
			return balance;
		}else {
			return -1;
		}
		
		} catch (Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}
}
