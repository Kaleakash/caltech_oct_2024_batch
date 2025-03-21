package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// by default it scan same package as well as sub package of same package. 
@SpringBootApplication(scanBasePackages = "com")  // enable @RestController, @Service, @Repository 
@EntityScan(basePackages = "com.bean")   // enable @Entity annotation 
@EnableJpaRepositories(basePackages = "com.repository") // enable repository features
public class SpringBootEmployeeRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeRestApiApplication.class, args);
		System.err.println("spring boot running on port number 8080");
	}

}
