package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.bean.Login;
import com.resource.DbResource;

public class LoginDao {

	public boolean signIn(Login login) {
		try {
			Connection con = DbResource.getDbConnection();
PreparedStatement pstmt = con.prepareStatement("select * from login where emailid = ? and password = ?");
      pstmt.setString(1, login.getEmailid());
      pstmt.setString(2, login.getPassword());
      ResultSet rs = pstmt.executeQuery();
      if(rs.next()) {
    	  return true;
      }else {
    	  return false;
      }
		} catch (Exception e) {
			System.err.println("In SignIn Dao method "+e.toString());
			return false;
		}
	}
	
	public int signUp(Login login) {
		try {
	  Connection con = DbResource.getDbConnection();
	  PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
      pstmt.setString(1, login.getEmailid());
      pstmt.setString(2, login.getPassword());
      int result = pstmt.executeUpdate();
        return result;
		} catch (Exception e) {
			System.err.println("In SignUp Dao method "+e.toString());
			return 0;
		}
	}
}
