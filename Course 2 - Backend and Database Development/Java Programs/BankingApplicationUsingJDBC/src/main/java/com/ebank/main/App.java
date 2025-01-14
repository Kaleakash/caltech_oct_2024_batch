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
	do {
		System.out.println("1:Account create");
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
		       
		default :System.out.println("Wrong choice");
		         break;
		}
		
		System.out.println("Do you want to continue(y/n)");
		con = sc.next();
	} while (con.equals("y"));
	System.out.println("Thank you Visit once again!");
	}

}
