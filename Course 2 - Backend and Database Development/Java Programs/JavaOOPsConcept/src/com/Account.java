package com;
public class Account {
private int accno;
private String name;
private float amount;
// empty constructor 
Account() {
	System.out.println("Object created...");
	this.accno=123;
	this.name="Unkonwn";
	this.amount=500;
}
//parameter constructor 
Account(int accno, String name, float amount){
	this.accno=accno;
	this.name=name;
	//this.amount = amount;
	if(amount<0) {
		this.amount = 0;
	}else {
		this.amount = amount;
	}
}
// this method help to set the value 
void setAccountInfo(int accno, String name, float amount) {
	this.accno=accno;
	this.name=name;
	//this.amount = amount;
	if(amount<0) {
		this.amount = 0;
	}else {
		this.amount = amount;
	}
}

void withdraw() {
	System.out.println("Withdraw functionality ");
	amount = amount-50;
}

void withdraw(float amount) {		// local variable name is amount as well as instance variable name amount
	System.out.println("dynamic Withdraw functionality ");
	float serviceTax=(float)0.5;	// explicit type casting converting double to float
	this.amount = this.amount-amount-serviceTax;		// this.amount is instance and amount is local 
}

void deposit() {
	System.out.println("Deposit functionality ");
	amount = amount+100;
}
void deposit(float amount) {
	System.out.println("dynamic Withdraw functionality ");
	float serviceTax=0.25f; // explicit type casting converting double to float
	this.amount = this.amount+amount-serviceTax;		// this.amount is instance and amount is local 
}

void displayAccountInfo() {
	System.out.println("Account details ");
	System.out.println("Accno "+accno+" Name "+name+" Amount "+amount);
}

}
