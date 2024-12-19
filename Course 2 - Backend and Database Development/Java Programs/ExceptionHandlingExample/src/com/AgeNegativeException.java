package com;

public class AgeNegativeException extends Exception{

	public AgeNegativeException() {
	super();		// calling super class ie Exception class empty constructor 
	}
	
	public AgeNegativeException(String message) {
	//super();	// calling super class ie Exception class empty constructor 
	super(message);		// calling explicity super class parameter constructor to set message 
	}
}
