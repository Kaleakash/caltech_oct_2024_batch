package com.bank.service;

import com.bank.bean.Account;

public class AccountServiceImp implements AccountService{

	// int abc[]=new int[10];	abc is a variable of type int which can hold 10 int value
	Account accounts[]=new Account[10];		// array object, it can hold 10 employee objects.
	static int numberOfAccont=0;
	@Override
	public String createAccount(Account account) {
		if(numberOfAccont==0) {
			accounts[numberOfAccont]=account;		// account memory created and store in 0 index position
			numberOfAccont++;
			return "Account Created";
		}else {
			int flag=0;
			for(int i=0;i<numberOfAccont;i++) {
				if(accounts[i].getAccno()==account.getAccno()) {
					flag++;
					break;
				}
			}
			if(flag==0) {
				accounts[numberOfAccont]=account;	
				numberOfAccont++;
				return "Account created";
			}else {
				flag=0;
				return "Account number must be unique";
			}
		}
		

	}

	
}
