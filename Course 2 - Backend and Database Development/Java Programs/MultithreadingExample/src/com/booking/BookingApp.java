package com.booking;

public class BookingApp implements Runnable{
	int avl=1;
	@Override
	public synchronized void run() {
	Thread t= Thread.currentThread();
	String name = t.getName();
	if(avl==1) {
		System.out.println(name+" got the ticket");
		avl=avl-1;
	}else {
		System.out.println(name+" no ticket available");
	}
		
	}
}
