package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	// http://localhost:9090
			@RequestMapping(value = "/",method = RequestMethod.GET)
			public String openPage() {
				System.out.println("Index page open");
				return "index"; // spring boot check the page name inside a templates folder using the viewresolver concept. 
			}
			@RequestMapping(value = "/loginPage",method = RequestMethod.GET)
			public String openLoginPage() {
				System.out.println("login page open");
				return "login";
			}
			@RequestMapping(value = "/SignIn",method = RequestMethod.POST)
			public String checkLoginDetails(HttpServletRequest req) {   // DI for request object 
				String emailid = req.getParameter("emailid");
				String password = req.getParameter("password");
				// we can check using jdbc or jdbcTempalte or JPA or spring jpa data
				if(emailid.equals("akash@gmail.com") && password.equals("123")) {
					return "success";		// success.html page 
				}else {
					return "failure";			// failure.html page 
				}
			}
}
