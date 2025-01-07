package com.ebank.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ebank.bean.Account;

public class AccountServiceImp implements AccountService{

	//List ll1  = new ArrayList();		// it is use to store any type of values
	//List<Integer> ll2 = new ArrayList<Integer>();		// it is use to store only integer 
	List<Account> listOfAccounts = new ArrayList<Account>();	// we can store n number of account objects. 
	
	@Override
	public String createAccount(Account account) {
		// TODO Auto-generated method stub
		int flag=0;
		if(listOfAccounts.size()==0) {
			listOfAccounts.add(account);
			return "Account created successfully";
		}
		
		Iterator<Account> li = listOfAccounts.iterator();
		while(li.hasNext()) {
			Account acc = li.next();
			if(acc.getAccno()==account.getAccno()) {
				flag++;
				break;
			}
		}
		
		if(flag==0) {
			listOfAccounts.add(account);
			return "Account created successfully";
		}else {
			flag=0;
			return "Account number must be unique";
		}
	}

	@Override
	public void displayAllAccountDetails() {
		
		Iterator<Account> li = listOfAccounts.iterator();
		while(li.hasNext()) {
			Account acc = li.next();
			System.out.println("Account Number "+acc.getAccno()+" Name  "+acc.getName()+" Amount "+acc.getAmount());
		}
	}

	
	@Override
	public String findAccountBalance(int accno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String withdraw(int accno, float amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deposit(int accno, float amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
