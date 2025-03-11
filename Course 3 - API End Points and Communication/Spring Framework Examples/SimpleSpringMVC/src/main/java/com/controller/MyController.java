package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
		// the request end with hello path then this method get call
	// http:afafadsfasfddfadffasdfs/hello
	//@RequestMapping(value = "hello")		// by default get consider
	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public ModelAndView sayHello() {		
		// coding.... 
		System.out.println("I Came Here!");
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to Spring mvc");
		mav.setViewName("display1.jsp");
		return mav;
	}
	@RequestMapping(value = "hi",method = RequestMethod.GET)
	public ModelAndView sayHi() {		
		// coding.... 
		System.out.println("I Came Here!");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display2.jsp");
		return mav;
	}
}
