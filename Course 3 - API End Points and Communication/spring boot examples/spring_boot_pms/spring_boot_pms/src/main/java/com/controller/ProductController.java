package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openIndexPage(Model mm) {  // DI for model api 
		System.out.println("Open Index Page");
		mm.addAttribute("name", "Akash Kale"); // like a request.setAttribute("name","akash kale");
		mm.addAttribute("project", "Product Management System");
		return "index";
	}
}
