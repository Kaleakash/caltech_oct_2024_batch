package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com") // Enable @Restcontroller, @Service,@Repository 
@EntityScan(basePackages = "com.bean")  // enable @Entity annotation 
@EnableJpaRepositories(basePackages = "com.repository") // Enable repository features 
@EnableDiscoveryClient			// deploy this application on Eureka server 
public class AccountMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMicroServiceApplication.class, args);
		System.err.println("Account micro service up on port number 9292");
	}

}
