package com;

public class AccountTest {

	public static void main(String[] args) {
//		Account acc1 = new Account();		// memory created..
//		acc1.accno=1212;
//		acc1.name="Steven";
//		acc1.amount=1400;
//		acc1.displayAccountInfo();
////		acc1.withdraw();
////		acc1.deposit();
//		acc1.withdraw(120);
//		acc1.deposit(300);
//		System.out.println("Afer transaction");
//		acc1.displayAccountInfo();
//
//		Account acc2 = new Account();		// separate memory created..
//		acc2.accno=1214;
//		acc2.name="John";
//		acc2.amount=1800;
//		acc2.displayAccountInfo();
////		acc2.deposit();
////		acc2.deposit();
//		acc2.withdraw(160);
//		acc2.deposit(350);
//		System.out.println("Afer transaction");
//		acc2.displayAccountInfo();
//		//acc2.deposit();
//		//acc2.withdraw();
		System.out.println("In Main class");
		
		Account acc3 = new Account();
		acc3.displayAccountInfo();
		
		Account acc4 = new Account();
		acc4.displayAccountInfo();
		
		Account acc5 = new Account(1,"Steven",12000);
		acc5.displayAccountInfo();
	}

}
