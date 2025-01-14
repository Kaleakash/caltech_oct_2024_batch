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
}
