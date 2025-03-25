
package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	// http://localhost:8181/
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String sayHelloFirstClient() {
		return "Welcome to First Micro Service Project";
	}
}
