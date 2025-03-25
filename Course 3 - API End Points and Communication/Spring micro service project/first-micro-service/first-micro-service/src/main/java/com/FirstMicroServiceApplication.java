package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com") // enable @RestController
@EnableDiscoveryClient				// it deploy on eureka server 
public class FirstMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMicroServiceApplication.class, args);
		System.err.println("First micro service project runnon on port number 8181");
	}

}
