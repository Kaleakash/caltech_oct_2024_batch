package com.bank.service;
import com.bank.bean.Account;

public class AccountServiceImp implements AccountService{
	// int abc[]=new int[10];	abc is a variable of type int which can hold 10 int value
	// Account accounts[]=new Account[10]; // array object, it can hold 10 employee objects.
	static Account accounts[];		// creating memory inside method base upon the value
	static int numberOfAccont=0;
	
	static final int TRANSACTION_CHARGE=10;
	
	public static void initAccountCreation(int numberOfAccounts) {
		accounts = new Account[numberOfAccounts];
	}
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

	@Override
	public void displayAllAccountDetails() {
		for(int i=0;i<numberOfAccont;i++) {
			System.out.println("Accno "+accounts[i].getAccno()+" Name "+accounts[i].getName()+"  Amount "+accounts[i].getAmount());
		}
	}
	@Override
	public String findAccountBalance(int accno) {
		int flag=0;
		int findAccountIndex =0;
		
		for(int i=0;i<numberOfAccont;i++) {
			if(accounts[i].getAccno()==accno) {
				findAccountIndex=i;
				flag++;
				break;
			}
		}
		if(flag==0) {
			return "Account not exists";
		}else {
			flag=0;
			return "Your account balance is "+accounts[findAccountIndex].getAmount();
		}
	}
	@Override
	public String withdraw(int accno, float amount) {
		// TODO Auto-generated method stub
		int flag=0;
		int findAccountIndex =0;
		
		for(int i=0;i<numberOfAccont;i++) {
			if(accounts[i].getAccno()==accno) {
				findAccountIndex=i;
				flag++;
				break;
			}
		}
		if(flag==0) {
			return "Account not exists";
		}else {
			flag=0;
			float oldAmount = accounts[findAccountIndex].getAmount();
			
			float updatedAmount = oldAmount-amount-TRANSACTION_CHARGE;
			accounts[findAccountIndex].setAmount(updatedAmount);
			
			return "Amount withdrawn successfully";
		}
	}
	@Override
	public String deposit(int accno, float amount) {
		// TODO Auto-generated method stub
				int flag=0;
				int findAccountIndex =0;
				
				for(int i=0;i<numberOfAccont;i++) {
					if(accounts[i].getAccno()==accno) {
						findAccountIndex=i;
						flag++;
						break;
					}
				}
				if(flag==0) {
					return "Account not exists";
				}else {
					flag=0;
					float oldAmount = accounts[findAccountIndex].getAmount();
					float updatedAmount = oldAmount+amount;
					accounts[findAccountIndex].setAmount(updatedAmount);
					return "Amount deposited successfully";
				}
	}

	
	
}
