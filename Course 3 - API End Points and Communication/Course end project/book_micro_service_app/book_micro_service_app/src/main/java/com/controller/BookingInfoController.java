package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.BookingInfo;
import com.service.BookingInfoService;

@Controller				// view must be thymeleaf 
public class BookingInfoController {
	
	@Autowired
	BookingInfoService bookingInfoService;
	
	
	// http://localhost:8181
	
	@GetMapping(value = "/")
	public String bookingLandingPage(Model mm, BookingInfo bi) {	// DI 
		mm.addAttribute("booking", bi);
		return "booking-cab";		// need page with name as booking-cab in template folder 
	}
	
	@PostMapping(value = "/bookCab")
	public String bookCab(Model mm, BookingInfo bi) {
		
		System.out.println(bi);  // call toString method 
		// call service method provide logic to book the base upon 
		// cab_fare micro service. 
		String result = bookingInfoService.bookCab(bi);		// bi hold customer name, source and destination 
		mm.addAttribute("msg", result);
		mm.addAttribute("booking", bi);
		return "booking-cab";		// need page with name as booking-cab 
	}
}
