package com.bank.main;

import java.util.Scanner;

import com.bank.bean.Account;
import com.bank.service.AccountService;
import com.bank.service.AccountServiceImp;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		String con="";
		int accno;
		String name;
		float amount;
		
		System.out.println("How many account do you want to create");
		int count = sc.nextInt();
		AccountServiceImp.initAccountCreation(count);
		
		AccountServiceImp asi = new AccountServiceImp();
		String result="";
		do {
			System.out.println("1:Account Create 2:View Account Details 3: find Balance 4 : Withdraw 5 :Deposit");
			System.out.println("Plz Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:	System.out.println("Account Create");
					
					System.out.println("Enter the accno");
					accno = sc.nextInt();
					System.out.println("Enter the name");
					name = sc.next();
					System.out.println("Enter the amount");
					amount = sc.nextFloat();
					
					Account acc = new Account();
					acc.setAccno(accno);
					acc.setName(name);
					acc.setAmount(amount);
					
					result = asi.createAccount(acc);
					System.out.println(result);
					break;
					
			case 2: System.out.println("Account Details");
					asi.displayAllAccountDetails();
					break;
					
			case 3: System.out.println("Enter the account number");
			        accno = sc.nextInt();
					result = asi.findAccountBalance(accno);
					System.out.println(result);
					break;
					
			case 4 :System.out.println("Withdraw Operation");
					System.out.println("Enter the accno number");
			        accno = sc.nextInt();
			        System.out.println("Enter the amount");
			        amount = sc.nextFloat();
			        result = asi.withdraw(accno, amount);
			        System.out.println(result);
			        break;
			        
			case 5 :System.out.println("Deposit Operation");
					System.out.println("Enter the accno number");
					accno = sc.nextInt();
					System.out.println("Enter the amount");
					amount = sc.nextFloat();
					result = asi.deposit(accno, amount);
					System.out.println(result);
					break;
					
			default :System.out.println("Wrong choice");
				break;
			}
			System.out.println("do you want to continue(y/n)");
			con = sc.next();
		
		} while (con.equals("y"));
		
		System.out.println("Thank You!");
	}

}
