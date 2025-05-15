package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public String signIn(Login login) {		// emailid, password and type of user retrieve from angular 
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
			Login ll = result.get();			// ll hold emailid, password and typeofuser from db.
					if(ll.getPassword().equals(login.getPassword())) {
						
							if(ll.getTypeofuser().equals(login.getTypeofuser()) && login.getTypeofuser().equals("admin")) {
								return "Admin login successfully";
							}else if(ll.getTypeofuser().equals(login.getTypeofuser()) && login.getTypeofuser().equals("customer")) {
								return "Customer login successfully";
							}else {
								return "role of user is wrong";
							}
						
					}else {
						return "Password is wrong";
					}
		}else {
			
			return "EmailId is wrong";
		}
	}
	
	public String signUp(Login login) {		// emailid, password and typeof user if type of user is admin can't create account. 
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
			if(login.getTypeofuser().equals("admin")) {
				return "You can't create admin account";
			}else {
				return "Account already exists";
			}	
		}else {
			loginRepository.save(login);
			return "Account created successfully";
		}
	}
}
