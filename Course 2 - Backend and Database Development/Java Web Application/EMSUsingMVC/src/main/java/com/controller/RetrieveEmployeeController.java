package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employee;
import com.dao.EmployeeDao;
import com.resource.DbResource;
import com.service.EmployeeService;

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
			EmployeeService es = new EmployeeService();
			List<Employee> listOfEmployee = es.findAllEmployee();
			request.setAttribute("obj", listOfEmployee);  // we store rs object in request scope. 
			RequestDispatcher rd = request.getRequestDispatcher("displayEmployee.jsp");
			rd.forward(request, response);	
		}

}
