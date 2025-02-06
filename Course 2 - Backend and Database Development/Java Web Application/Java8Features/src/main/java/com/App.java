package com;

public class App {

	public static void main(String[] args) {
	Hsbc hsbc = new Hsbc();
	hsbc.withdraw();
	hsbc.deposit();
	hsbc.findBalance(100);
	Bank.roi();		//static method we are calling using interface name. 
	//hsbc.roi();
	
	System.out.println("--------------------");
	BankOfAmerica boa = new BankOfAmerica();
	boa.deposit();
	boa.withdraw();
	boa.findBalance(101);
	Bank.roi();
	}

}
