package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	
	// coding, call service or jdbc code base upon condition we can navigate to another jsp page. 
	String msg = "Welcome to Java Training using Web Application";
	String technologies[] ={"Java","Python","React JS","Angular"};
	HttpSession hs = request.getSession();
	hs.setAttribute("msg", msg);
	hs.setAttribute("tech", technologies);
	response.sendRedirect("displayMsg.jsp");
	}

	
}
