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
public class GpayMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpayMicroServiceApplication.class, args);
		System.err.println("gpay micro service running on port number 8484");
	}

	// this methdod is responsible to create the object of RestTemplate. Object we are creating explicitly.
	// But maintain by container. 
	
	@Bean							// if we use @LoadBalance annotation we can call other micro service by name rather than that machine 
	@LoadBalanced					// ip address and port number. 
	public RestTemplate restTemplate() {
		System.out.println("Rest Template object created..");
		return new RestTemplate();
	}
}
