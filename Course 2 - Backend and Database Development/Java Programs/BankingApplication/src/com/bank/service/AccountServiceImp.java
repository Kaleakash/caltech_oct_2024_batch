package com.bank.service;

import com.bank.bean.Account;

public class AccountServiceImp implements AccountService{

	// int abc[]=new int[10];	abc is a variable of type int which can hold 10 int value
	Account accounts[]=new Account[10];		// array object, it can hold 10 employee objects.
	static int index=0;
	@Override
	public String createAccount(Account accno) {
		// TODO Auto-generated method stub
		// logic to create the account or return error message with some condition. 
		if(index==0) {
			accounts[index]=new Account();		// account memory created and store in 0 index position
			index++;
		}else {
			accounts[index]=new Account();	
			index++;
		}
		
		return null;
	}

	
}
