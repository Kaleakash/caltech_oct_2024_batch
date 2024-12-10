package com;

public class AccountTest {

	public static void main(String[] args) {
		Account acc1 = new Account();		// memory created..
		acc1.withdraw();
		acc1.deposit();

		Account acc2 = new Account();		// separate memory created..
		acc2.deposit();
		acc2.withdraw();
	}

}
