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
		
		AccountServiceImp asi = new AccountServiceImp();
		String result="";
		do {
			System.out.println("1:Account Create 2:View Account Details 3: find Balance");
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
					
				
			default :System.out.println("Wrong choice");
				break;
			}
			System.out.println("do you want to continue(y/n)");
			con = sc.next();
		
		} while (con.equals("y"));
		
		System.out.println("Thank You!");
	}

}
