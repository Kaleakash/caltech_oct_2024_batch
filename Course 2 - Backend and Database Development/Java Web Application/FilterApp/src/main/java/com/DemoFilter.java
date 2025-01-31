package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter(urlPatterns = { "/DemoFilter","/DemoServlet" }, servletNames = { "DemoServlet" })
public class DemoFilter extends HttpFilter implements Filter {       
    public DemoFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// before request 
		PrintWriter pw = response.getWriter();
		pw.println("Before Request reach to Servlet <br/>");
			chain.doFilter(request, response);
		// before response 
		pw.println("After servlet code executed... <br/>");
		response.setContentType("text/html");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
