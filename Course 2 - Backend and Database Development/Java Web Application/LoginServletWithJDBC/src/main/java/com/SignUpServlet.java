package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SignUpServlet() {
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
		RequestDispatcher rd = request.getRequestDispatcher("signup.html");
		
		// JDBC code with insert query 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root@123");
PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
pstmt.setString(1, emailid);
pstmt.setString(2, password);
	int result = pstmt.executeUpdate();
	if(result>0) {
		pw.println("Account created successfully");
		rd.include(request, response);
	}
		} catch (Exception e) {
			pw.println(e.getMessage());
			rd.include(request, response);
		}
		
		response.setContentType("text/html");  // response must be type of html format. 
	}

}
