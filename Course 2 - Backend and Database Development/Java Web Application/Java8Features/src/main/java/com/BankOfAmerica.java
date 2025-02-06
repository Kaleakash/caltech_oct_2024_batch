package com;

public class BankOfAmerica implements Bank{

	@Override
	public void withdraw() {
		System.out.println("Bank Of America withdraw logic");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Bank Of America deposit logic");
	}

	@Override
	public void findBalance(int accno) {
		System.out.println("Bank Of America find balance logic");
	}

}
