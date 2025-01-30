package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    int count;	// default value is 0
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<font color=red size=5>");
		HttpSession hs = request.getSession();
		if(hs.isNew()) {
			pw.println("New Client");
		}else {
			pw.println("Old Client");
		}
		pw.println("<br/> Value of count is "+count);
		count++;
		pw.println("<br/> Session Id "+hs.getId());
		pw.println("<br/> Session creation time "+hs.getCreationTime());  // millisecond format 
		pw.println("<br/> Session creation time in date and time format "+new Date(hs.getCreationTime()));
		pw.println("<br/> last access time  "+new Date(hs.getLastAccessedTime()));   // 1800
		pw.println("<br/> default session time "+hs.getMaxInactiveInterval());
		hs.setMaxInactiveInterval(600);
		pw.println("<br/> session inactive time "+hs.getMaxInactiveInterval());
		if(count%5==0) {
			hs.invalidate();				// destroy the session 
		}
		pw.println("</font>");
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
		response.setContentType("text/html");
		rd.include(request, response);
	}

	

}
