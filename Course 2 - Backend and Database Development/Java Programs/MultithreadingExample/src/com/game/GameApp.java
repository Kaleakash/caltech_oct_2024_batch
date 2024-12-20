package com.game;

public class GameApp {

	public static void main(String[] args) throws Exception{
	Car cc = new Car();
	Bike bb = new Bike();
	Thread c1 = new Thread(cc);
	Thread c2 = new Thread(cc);
	Thread c3 = new Thread(cc);
	
	Thread b1 = new Thread(bb);
	Thread b2 = new Thread(bb);
	Thread b3 = new Thread(bb);
	Thread b4 = new Thread(bb);
//	Thread t = Thread.currentThread();
//	System.out.println(t);
	System.out.println("Start the Game");
	Thread.sleep(1000);
	System.out.println("1...");
	Thread.sleep(1000);
	System.out.println("2...");
	Thread.sleep(1000);
	System.out.println("3...");
	c1.setName("Innova Car");
	c2.setName("Santro Car");
	c3.setName("BMW Car");
	b1.setName("Honda");
	b2.setName("Pulsar");
	b3.setName("TVS");
	b4.setName("Activa");
	b1.start();
	b2.start();
	b3.start();
	b4.start();
	c1.start();
	c2.start();
	c3.start();
	}

}
