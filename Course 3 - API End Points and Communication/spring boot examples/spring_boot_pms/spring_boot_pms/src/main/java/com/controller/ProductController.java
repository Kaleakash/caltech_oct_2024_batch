package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	// http://localhost:9090/
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openIndexPage(Model mm,Product product) {  // DI for model api as well as Product class 
		System.out.println("Open Index Page");
		mm.addAttribute("name", "Akash Kale"); // like a request.setAttribute("name","akash kale");
		mm.addAttribute("pp", product);  // we store product object in model scope
		mm.addAttribute("project", "Product Management System");
		return "index";
	}
	
	@RequestMapping(value = "/storeProduct",method = RequestMethod.POST)
	public String storeProduct(Model mm, Product product) {
		// if we use normal form with HttpServletRequest concept. 
		// we need to receive value using request.getParameter 
		// we need to do type casting with respective data type of variable. 
		// we need to convert those value to java bean object and pass to service layer 
		String result = productService.storeProduct(product);
		product.setPid(0);
		product.setPname("");
		product.setPrice(0.0f);		// reset value not to display once again on same form. 
		//System.out.println(product.toString());  // we check pname and price set or not
		mm.addAttribute("name", "Akash Kale"); // like a request.setAttribute("name","akash kale");
		mm.addAttribute("pp", product);  // we store product object in model scope
		mm.addAttribute("project", "Product Management System");
		mm.addAttribute("msg", result);
		return "index";
	}
}
