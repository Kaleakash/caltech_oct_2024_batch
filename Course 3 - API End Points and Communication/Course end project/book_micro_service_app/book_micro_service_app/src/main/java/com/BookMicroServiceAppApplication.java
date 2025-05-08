package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
@EnableJpaRepositories(basePackages = "com.repository")
@EnableDiscoveryClient
public class BookMicroServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMicroServiceAppApplication.class, args);
		System.err.println("booking micro service up on port number 8181");
	}

	@Bean	    // spring container will call this method 
	@LoadBalanced  // calling another micro service using service name available in eureka server rather than localhost and port number. 
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
