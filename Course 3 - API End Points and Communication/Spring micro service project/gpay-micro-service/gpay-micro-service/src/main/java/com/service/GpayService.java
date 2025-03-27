package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bean.Gpay;
import com.repository.GpayRepository;

@Service
public class GpayService {

	@Autowired
	GpayRepository gpayRepository;
	
	@Autowired
	RestTemplate restTemplate;   // this object is use to call other rest api using get, post, put or delete
	
	
	public String createAccount(Gpay gpay) {			// gpay contains only emailid 
		
		int accnumber = restTemplate.getForObject("http://localhost:8383/account/findAccountNumber/"+gpay.getEmailid(), Integer.class);
		if(accnumber==-1) {
			return "Account not present in bank so We didn't create gpay account";
		}else {
			gpay.setAccnum(accnumber);
			gpayRepository.save(gpay);
			return "Account created";
		}
		
	}
}
