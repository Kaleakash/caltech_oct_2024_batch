package com.ebank.service;

import com.ebank.bean.Account;
import com.ebank.dao.AccountDao;

public class AccountService {

	AccountDao ad = new AccountDao();
	
	public String createAccount(Account account) {
		if(account.getAmount()<1000) {
			return "To create account need min 1000";
		}else if(ad.createAccount(account)>0) {
			return "Account created successfully";
		}else {
			return "Account didn't create";
		}
	}
	
	public String withdrawn(Account account) {
		float balance =ad.findBalance(account.getAccno()); 
		if(balance==-1) {
			return "Account doesn't exists";
		}else {
			if(balance >  account.getAmount()) {
				
				if(ad.withdrawn(account)>0) {
					return "Withdraw done successfully";
				}else {
					return "Didn't withdrawn";
				}
				
	
			}else {
				return "InSufficient amount you can't withdraw";
			}
		}
	}
	
	public String deposit(Account account) {
		if(ad.deposit(account)>0) {
			return "Deposited amount successfully";
		}else {
			return "Amount didn't deposit";
		}
	}
	
	public String findBalance(int accno) {
		float balance = ad.findBalance(accno);
		if(balance==-1) {
			return "Account doesn't exists";
		}else {
			return "Your balance is "+balance;
		}
	}
}
