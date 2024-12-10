package com;

public class Account {
int accno;
String name;
float amount;

void withdraw() {
	System.out.println("Withdraw functionality ");
	amount = amount-50;
}

void deposit() {
	System.out.println("Deposit functionality ");
	amount = amount+100;
}

void displayAccountInfo() {
	System.out.println("Account details ");
	System.out.println("Accno "+accno+" Name "+name+" Amount "+amount);
}

}
