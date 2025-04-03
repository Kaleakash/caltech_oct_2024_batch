package com.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public boolean checkLogin(String emailid, String password) {
		if(emailid.equals("admin@gmail.com") && password.equals("admin@123")) {
			return true;
		}else {
			return false;
		}
	}
}
