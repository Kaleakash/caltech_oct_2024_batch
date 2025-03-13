package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWelcomeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWelcomeAppApplication.class, args);
		System.out.println("spring boot is ready");
	}

}
