package com.bank.service;

import com.bank.bean.Account;

public interface AccountService {
// set of methods 
	public String createAccount(Account account);
	
	public void displayAllAccountDetails();
	
	public String findAccountBalance(int accno);
	
	public String withdraw(int accno, float amount);
	
	public String deposit(int accno, float amount);
}
