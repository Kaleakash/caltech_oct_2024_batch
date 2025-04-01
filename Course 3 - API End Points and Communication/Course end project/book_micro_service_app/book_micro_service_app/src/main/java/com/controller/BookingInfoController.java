package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.BookingInfo;

@Controller				// view must be thymeleaf 
public class BookingInfoController {
	// http://localhost:8181
	
	@GetMapping(value = "/")
	public String bookingLandingPage(Model mm, BookingInfo bi) {
		mm.addAttribute("booking", bi);
		return "booking-cab";		// need page with name as booking-cab 
	}
	
	@PostMapping(value = "/bookCab")
	public String bookCab(Model mm, BookingInfo bi) {
		
		System.out.println(bi);  // call toString method 
		// call service method provide logic to book the base upon 
		// cab_fare micro service. 
		mm.addAttribute("msg", "Simple testing message");
		mm.addAttribute("booking", bi);
		return "booking-cab";		// need page with name as booking-cab 
	}
}
