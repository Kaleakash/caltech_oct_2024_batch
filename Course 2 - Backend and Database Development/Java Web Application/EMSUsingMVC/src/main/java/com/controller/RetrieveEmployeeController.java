package com.controller;

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

/**
 * Servlet implementation class RetrieveEmployeeController
 */
@WebServlet("/RetrieveEmployeeController")
public class RetrieveEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RetrieveEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb_mvc", "root", "root@123");
			PreparedStatement pstmt = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				pw.println("id is "+rs.getInt(1)+" name is "+rs.getString(2)+" Salary is "+rs.getFloat(3)+" DOJ "+rs.getDate(4));
//			}
			
			// display output in table format 
//			pw.println("<table border=1>");
//			pw.println("<tr><th>Id</th><th>Name</th><th>Salary</th><th>DOJ</th></tr>");
//			while(rs.next()) {
//	pw.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getFloat(3)+"</td><td>"+rs.getDate(4)+"</td></tr>");
//			}
//			pw.println("</table>");
			request.setAttribute("obj", rs);  // we store rs object in request scope. 
			RequestDispatcher rd = request.getRequestDispatcher("displayEmployee.jsp");
			rd.forward(request, response);
				
		}catch(Exception e) {
			pw.println(e.toString());
		}
		}

}
