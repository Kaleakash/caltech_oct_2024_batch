package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller			// controller specific annotation provide servlet features 
public class LoginController {

	// like a doPost method 
	
	@RequestMapping(value = "SignIn",method = RequestMethod.POST)
	public ModelAndView loginSignIn(HttpServletRequest request) { // DI for request object
		String emailid = request.getParameter("email");
		String password = request.getParameter("password");
		// check emailid and password 
		// we can check hard coding or using jdbc or using jdbcTemplate or Jpa etc
		ModelAndView mav = new ModelAndView();
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			mav.addObject("user", "akash@gmail.com");  // equal to request.setAttribute("user","akash@gmail.com");
			//request.setAttribute("user", "akash@gmail.com");
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		
		return mav;
	}
}



