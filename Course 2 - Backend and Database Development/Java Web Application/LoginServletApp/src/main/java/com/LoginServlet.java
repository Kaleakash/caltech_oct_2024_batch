package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();// it help to display the output on browser 
		// request.getParameter("fieldName") which help to receive the value as string 
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			pw.println("Successfully login! with Get Method");
			rd1.forward(request, response);		// target page output. 
		}else {
			pw.println("Failure try once again! with Method");
			rd2.include(request, response); 	// error message + login.html page code. 
		}
		response.setContentType("text/html");// set response as html format. 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();// it help to display the output on browser 
		// request.getParameter("fieldName") which help to receive the value as string 
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			pw.println("Successfully login! with Post method");
			rd1.forward(request, response);		// target page output. 
		}else {
			pw.println("Failure try once again! with Post method");
			rd2.include(request, response); 	// error message + login.html page code. 
		}
		response.setContentType("text/html");// set response as html format. 
	}

}
