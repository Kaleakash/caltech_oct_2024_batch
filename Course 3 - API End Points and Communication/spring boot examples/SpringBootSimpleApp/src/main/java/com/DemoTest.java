package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication		// entry of the application 
public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DemoTest.class, args);// start the application
		System.out.println("spring boot is ready...");
	}

}
