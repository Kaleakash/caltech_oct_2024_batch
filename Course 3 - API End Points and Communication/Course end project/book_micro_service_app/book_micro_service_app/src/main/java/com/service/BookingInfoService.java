package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bean.BookingInfo;
import com.repository.BookingInfoRepository;

@Service
public class BookingInfoService {

	
	@Autowired
	BookingInfoRepository bookingInfoRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	public String bookCab(BookingInfo bi) {		// it hold customer name, source and destination 
		// login to store booking details 
	//float amount = restTemplate.getForObject("http://localhost:8282/cab/findFare/A/B", Float.class);	// fix source and destination
	//float amount = restTemplate.getForObject("http://localhost:8282/cab/findFare/"+bi.getSource()+"/"+bi.getDestination(), Float.class);	// dynamic source and destination
	float amount = restTemplate.getForObject("http://cabservice/cab/findFare/"+bi.getSource()+"/"+bi.getDestination(), Float.class);	//calling service by name 
	if(amount==-1) {
		return "No Cab are avaiable with source as "+bi.getSource()+" and Destination "+bi.getDestination();
	}else {
		bi.setPrice(amount); 
		bookingInfoRepository.save(bi);
		return "Your cab book successfully";
	}
	}
}
