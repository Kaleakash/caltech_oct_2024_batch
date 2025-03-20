package com.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

	// http://localhost:8080/hello
	
	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public @ResponseBody String sayHello() {
		
		return "Welcome to Spring simple rest api with path as hello";
	}
	
	// http://localhost:8080/hi
	
	@RequestMapping(value = "hi",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public @ResponseBody String sayHi(){
		return "Welcome to spring rest api with hi path";
	}
}
