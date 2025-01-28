package com.service;

import com.bean.Login;
import com.dao.LoginDao;

public class LoginService {

	LoginDao ld = new LoginDao();
	
	public String signIn(Login login) {
		String originalPassword = login.getPassword();			// 123
		StringBuffer sb = new StringBuffer(originalPassword);	// string buffer class object. 
		sb.reverse();									// 321 
		String reversPassword =sb.toString();     // sb object convert to string format. 
		login.setPassword(reversPassword);  
		
		if(ld.signIn(login)) {
			return "successfully login";
		}else {
			return "failure try once again";
		}
	}
	
	public String signUp(Login login) {
		String originalPassword = login.getPassword();			// 123
		StringBuffer sb = new StringBuffer(originalPassword);	// string buffer class object. 
		sb.reverse();									// 321 
		String reversPassword =sb.toString();     // sb object convert to string format. 
		login.setPassword(reversPassword);  
		
		if(ld.signUp(login)>0) {
			return "Account created successfully";
		}else {
			return "Account didn't create";
		}
	}
}
