package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Gpay;
import com.service.GpayService;

@RestController
@RequestMapping("gpay")				// http://localhost:8484/gpay/*
public class GpayController {

	@Autowired
	GpayService gpayService;
	
	// http://localhost:8484/gpay/create
	// 1st option {"emailid":"lex@gmail.com","accnum":1125} no interaction with account micro service 
	
	
	// 2nd option {"emailid":"lex@gmail.com"}	
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAccount(@RequestBody Gpay gpay) {
		return gpayService.createAccount(gpay);
	}
}
