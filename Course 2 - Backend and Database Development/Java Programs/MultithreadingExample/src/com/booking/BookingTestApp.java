package com.booking;

public class BookingTestApp {

	public static void main(String[] args) {
		BookingApp b1 = new BookingApp();	// avl=1
		//BookingApp b2 = new BookingApp();	// avl=1
		//BookingApp b3 = new BookingApp();	// avl=1
		Thread t1  = new Thread(b1);
		Thread t2  = new Thread(b1);
		Thread t3  = new Thread(b1);
		t1.setName("Steven");
		t2.setName("John");
		t3.setName("Lex");
		t1.start();
		t2.start();
		t3.start();
	}

}
