package com;

public class AccountTest {

	public static void main(String[] args) {
		Account acc1 = new Account();		// memory created..
		acc1.accno=1212;
		acc1.name="Steven";
		acc1.amount=1400;
		acc1.displayAccountInfo();
		acc1.withdraw();
		acc1.deposit();
		System.out.println("Afer transaction");
		acc1.displayAccountInfo();

		Account acc2 = new Account();		// separate memory created..
		acc2.accno=1214;
		acc2.name="John";
		acc2.amount=1800;
		acc2.displayAccountInfo();
		acc2.deposit();
		acc2.deposit();
		System.out.println("Afer transaction");
		acc2.displayAccountInfo();
		//acc2.deposit();
		//acc2.withdraw();
	}

}
