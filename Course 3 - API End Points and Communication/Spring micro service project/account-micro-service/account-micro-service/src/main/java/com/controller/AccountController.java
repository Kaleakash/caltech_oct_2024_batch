package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	// http://localhost:8383/account/findBalance/1122		passing account number using path param 
	// http://localhost:8383/account/findBalance/1155
	
	@GetMapping(value = "findBalance/{accno}")
	public String findBalance(@PathVariable("accno") int accnumber) {
		return accoutService.findBalance(accnumber);
	}
	
		// http://localhost:8383/account/withdraw 
		
		// json data : {"accno":1122,"amount":500}
		// method specific annotation 
		@PutMapping(value = "withdraw",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String withdrawAmount(@RequestBody Account account) {
			return accoutService.withdrawn(account);
		}
		
		// http://localhost:8383/account/deposit 
		
		// json data : {"accno":1122,"amount":500}
		// method specific annotation 
		@PutMapping(value = "deposit",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String depositeAmount(@RequestBody Account account) {
			return accoutService.deposit(account);
		}
		
		// http://localhost:8383/account/findAccountNumber/steven@gmail.com     1122
		// http://localhost:8383/account/findAccountNumber/lex@gmail.com		-1 
		
		@GetMapping(value = "findAccountNumber/{emailid}")
		public Integer findAccountNumber(@PathVariable("emailid") String emailid) {
			return accoutService.findAccountNumber(emailid);
		}
}












