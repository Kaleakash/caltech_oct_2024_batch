package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	// http://localhost:9090
			@RequestMapping(value = "/",method = RequestMethod.GET)
			public String openPage() {
				System.out.println("coding...");
				return "index"; // spring boot check the page name inside a templates folder using the viewresolver concept. 
			}
}
