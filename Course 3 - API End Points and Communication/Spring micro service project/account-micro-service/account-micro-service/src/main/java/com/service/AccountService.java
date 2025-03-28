package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Account;
import com.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public String createAccount(Account account) {
		Optional<Account> result = accountRepository.findById(account.getAccno());
		if(result.isPresent()) {
			return "Account number must be unique";
		}else {
			accountRepository.save(account);
			return "Account created successfully";
		}
	}
	
	public String findBalance(int accno) {
		Optional<Account> result = accountRepository.findById(accno);	// passing account number 
		if(result.isPresent()) {						// if present 
			Account account = result.get();					// account object hold that account details. 
			return "Your balance amount is "+account.getAmount();
		}else {
			return "No account exists with account number as "+accno;
		}
	}
	
	public String withdrawn(Account account) {     // which contains accno and amount 
		Optional<Account> result = accountRepository.findById(account.getAccno());	// passing account number 
		if(result.isPresent()) {						// if present 
			Account existsAccount = result.get();					// account object hold that account details. 
			float oldAmount = existsAccount.getAmount();
			float updateNewAmount = oldAmount-account.getAmount(); //1000-200
			if(updateNewAmount<0) {
					return "InSufficient amount can't withdraw";
			}else {
				existsAccount.setAmount(updateNewAmount);
				accountRepository.saveAndFlush(existsAccount);
				return "Amount withdrawn successfully";
			}
		}else {
			return "Amount didn't withdraw, because account doesn't exists";
		}
	}
	
	public String deposit(Account account) {     // which contains accno and amount 
		
		Optional<Account> result = accountRepository.findById(account.getAccno());	// passing account number 
		if(result.isPresent()) {						// if present 
			Account existsAccount = result.get();					// account object hold that account details. 
			float oldAmount = existsAccount.getAmount();
			float updateNewAmount = oldAmount+account.getAmount(); //1000+200
			existsAccount.setAmount(updateNewAmount);
			accountRepository.saveAndFlush(existsAccount);
			return "Amount deposited successfully";
		}else {
			return "Amount didn't deposite, because account doesn't exists";
		}
	}
	
	public int findAccountNumber(String emailid) {
		try {
			System.out.println("Gpay Micro Service send the reqeust");
			return accountRepository.findAccountNumber(emailid);
		}catch(Exception e) {
			System.err.println(e);
			return -1;
		}
	}
}


