package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployeeController
 */
@WebServlet("/AddEmployeeController")
public class AddEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		//int id = request.getParameter("id");
		// receive the value from form and convert to specific data types. 
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		float salary = Float.parseFloat(request.getParameter("salary"));
		LocalDate doj = LocalDate.parse(request.getParameter("doj"));
		
		RequestDispatcher rd = request.getRequestDispatcher("addEmployee.jsp");
		// we write business logic as well as database logic. 
		
		// business logic 
		if(salary<10000) {
			pw.println("Salary must be > 10000");
			rd.include(request, response);
		}else {
			// JDBC code 
			//pw.println("Ready to store the information in db");
			try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb_mvc", "root", "root@123");
	PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?,?)");
	pstmt.setInt(1, id);
	pstmt.setString(2, name);
	pstmt.setFloat(3, salary);
	pstmt.setString(4, doj.toString());
	int result = pstmt.executeUpdate();
	if(result>0) {
		pw.print("Employee stored successfully");
		rd.include(request, response);
	}
			} catch (Exception e) {
				pw.print(e.toString());
			    rd.include(request, response);
			}
			
		}
		response.setContentType("text/html");
	}

}




