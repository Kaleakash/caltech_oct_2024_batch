package com.ebank.main;

import java.util.Scanner;

import com.ebank.bean.Account;
import com.ebank.service.AccountService;

public class App {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int accno;
	String name;
	float amount;
	int choice;
	String result;
	String con;
	AccountService as = new AccountService();
	System.out.println("Welcome to EBanking Application!");
	do {
		System.out.println("1:Account create 2 :withdrawn 3 :Deposit 4 :Balance");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		
		switch(choice) {
		
		case 1:System.out.println("Enter the account number");
		       accno = sc.nextInt();
		       System.out.println("Enter the name");
		       name = sc.next();
		       System.out.println("Enter the amount");
		       amount = sc.nextFloat();
		       
		       Account acc = new Account();
		       acc.setAccno(accno);
		       acc.setName(name);
		       acc.setAmount(amount);
		       
		       result = as.createAccount(acc);
		       System.out.println(result);
		       break;
		
		       
		case 2:System.out.println("Enter the account number");
	       accno = sc.nextInt();
	       
	       System.out.println("Enter the amount");
	       amount = sc.nextFloat();
	       
	       Account acc1 = new Account();
	       acc1.setAccno(accno);
	       acc1.setAmount(amount);
	       
	       result = as.withdrawn(acc1);
	       System.out.println(result);
	       break;       
		
	       
		case 3:System.out.println("Enter the account number");
	       accno = sc.nextInt();
	       
	       System.out.println("Enter the amount");
	       amount = sc.nextFloat();
	       
	       Account acc2 = new Account();
	       acc2.setAccno(accno);
	      
	       acc2.setAmount(amount);
	       
	       result = as.deposit(acc2);
	       System.out.println(result);
	       break;
	       
		case 4:System.out.println("Enter the account number");
	       accno = sc.nextInt();
	       result = as.findBalance(accno);
	       System.out.println(result);
	       break;
	       
	       
		default :System.out.println("Wrong choice");
		         break;
		}
		
		System.out.println("Do you want to continue(y/n)");
		con = sc.next();
	} while (con.equals("y"));
	System.out.println("Thank you Visit once again!");
	}

}
