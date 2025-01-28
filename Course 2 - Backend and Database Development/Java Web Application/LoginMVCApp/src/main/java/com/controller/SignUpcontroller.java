package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Login;
import com.service.LoginService;


@WebServlet("/SignUpcontroller")
public class SignUpcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
           
    public SignUpcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		// receive the value from form 
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		
		// convert these information into object 
		Login ll = new Login();
		ll.setEmailid(emailid);
		ll.setPassword(password);
		
		// create service class object and pass the login object 
		LoginService ls = new LoginService();
		String result = ls.signUp(ll);
		
		// display result and include the signup.jsp page 
		pw.print(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
		rd.include(request, response);
		response.setContentType("text/html");
	}

}





