package com.zumba.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zumba.bean.Batch;
import com.zumba.service.BatchService;

/**
 * Servlet implementation class BatchController
 */
@WebServlet("/BatchController")
public class BatchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BatchController() {
        super();
        // TODO Auto-generated constructor stub
    }

    BatchService bs = new BatchService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Batch> listOfBatch = bs.viewAllBatchDetails();
		HttpSession hs = request.getSession();
		hs.setAttribute("batches", listOfBatch);
		response.sendRedirect("viewBatch.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
