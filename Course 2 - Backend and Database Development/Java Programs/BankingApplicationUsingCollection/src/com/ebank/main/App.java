package com.ebank.main;

import java.util.Scanner;

import com.ebank.bean.Account;
import com.ebank.service.AccountService;
import com.ebank.service.AccountServiceImp;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String con="";
		int choice;
		int accno;
		String name;
		float amount;
		AccountService as = new AccountServiceImp();
		String result;
		do {
			System.out.println("1:Create Account 2 : Display all account details 3: Check balance 4 : Withdrawn 5 :Deposit");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter the account number");
					accno = sc.nextInt();
					System.out.println("Enter the name");
					name = sc.next();
					System.out.println("Enter the amount");
					amount = sc.nextFloat();
					Account acc1  = new Account();
					acc1.setAccno(accno);
					acc1.setName(name);
					acc1.setAmount(amount);
					result = as.createAccount(acc1);
					System.out.println(result);
				break;
			case 2 : as.displayAllAccountDetails();
				break;
				
			case 3 :System.out.println("Enter the account number");
					accno = sc.nextInt();
					result = as.findAccountBalance(accno);
					System.out.println(result);
					break;
			case 4 :System.out.println("Enter the account number");
					accno = sc.nextInt();
					System.out.println("Enter the amount");
					amount = sc.nextFloat();
					result = as.withdraw(accno, amount);
					System.out.println(result);
					break;
			case 5:	System.out.println("Enter the account number");
					accno = sc.nextInt();
					System.out.println("Enter the amount");
					amount = sc.nextFloat();
					result = as.deposit(accno, amount);
					System.out.println(result);
					break;
			default:System.out.println("Wrong choice");
				break;
			}
			System.out.println("Do you want to continue?");
			con = sc.next();
		} while (con.equals("y"));

		System.out.println("Thank you Visit once again!");
	}

}
