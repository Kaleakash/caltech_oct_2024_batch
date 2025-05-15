package com;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.bean.Login;
import com.repository.LoginRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
@EnableJpaRepositories(basePackages = "com.repository")
@EnableDiscoveryClient
public class LoginAppApplication {

	@Autowired
	LoginRepository loginRepository;
	
	@PostConstruct			// when spring boot application up it will call this method. 
	public void init() {
		System.out.println("init method called..");
		Login ll = new Login();
		ll.setEmailid("admin@gmail.com");
		ll.setPassword("admin@123");
		ll.setTypeofuser("admin");
		Optional<Login> result = loginRepository.findById(ll.getEmailid());
		if(result.isPresent()) {
			System.out.println("Admin Account already present");
		}else {
		loginRepository.save(ll);
		System.out.println("Admin Account created");
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(LoginAppApplication.class, args);
		System.err.println("Login Micro Service Up!");
	}

}
