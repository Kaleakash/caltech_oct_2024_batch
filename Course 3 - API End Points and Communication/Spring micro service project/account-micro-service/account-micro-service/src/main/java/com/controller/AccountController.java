package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Account;
import com.service.AccountService;

@RestController	
@RequestMapping("account")			// http://localhost:8383/account/*
public class AccountController {	// // http://localhost:8383/transaction/*

	@Autowired
	AccountService accoutService;
	
	// http://localhost:8383/account/create 
	// json data : {"accno":1122,"name":"john","emailid":"john@gmail.com","amount":500}
	
	// generic annotation we need to use method attribute with Get or Post or Put or Delete  
	//@RequestMapping(value = "create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	
	// http://localhost:8383/account/create 
	// method specific annotation 
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAccount(@RequestBody Account account) {
		return accoutService.createAccount(account);
	}
}












