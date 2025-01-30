package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }
    int id = 100;
    String name = "Steven";
    float salary = 14000.50f;		// instance 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<br/> In Servlet Page ");
		pw.println("<br/> id is "+id);
		pw.println("<br/> name is "+name);
		pw.println("<br/> salary is "+salary);
		
		//1st approach 
//		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
//		request.setAttribute("eid", id);
//		request.setAttribute("ename", name);
//		request.setAttribute("esalary", salary);
//		rd.include(request, response);					// source page code + target page code merge 
		
		//2nd approach 
//		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
//		request.setAttribute("eid", id);
//		request.setAttribute("ename", name);
//		request.setAttribute("esalary", salary);
//		rd.forward(request, response);					// we can see only target page output. 
		
		// 3rd approach 
//		request.setAttribute("eid", id);
//		request.setAttribute("ename", name);
//		request.setAttribute("esalary", salary);
//		response.sendRedirect("welcome.jsp");		// we get output of target page as well as it 
													// generate new request 
		
		// 4th approach 
		HttpSession hs = request.getSession();
		hs.setAttribute("eid", id);
		hs.setAttribute("ename", name);
		hs.setAttribute("esalary", salary);
		response.sendRedirect("welcome.jsp");
		
		response.setContentType("text/html");
	}

	
	

}
