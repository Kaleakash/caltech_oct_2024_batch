package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SignInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();// this class object help us to display output on browser. 
		// receive emailid and password from signup.html page 
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		
		// it is use to navigate from one page to another page 
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		
		// JDBC code with insert query 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root@123");
PreparedStatement pstmt = con.prepareStatement("select * from login where emailid=? and password=?");
pstmt.setString(1, emailid);
pstmt.setString(2, password);
	ResultSet rs = pstmt.executeQuery();
	
	if(rs.next()) {
		rd1.forward(request, response);
	}else {
		pw.println("Emailid or password is wrong");
		rd2.include(request, response);
	}
		} catch (Exception e) {
			pw.println(e.getMessage());
		}
		
		response.setContentType("text/html");  // response must be type of html format. 
	}

}
