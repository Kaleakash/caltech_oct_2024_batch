package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.CabFare;
import com.repository.CabFareRepository;

@Service
public class CabFareService {

	@Autowired
	CabFareRepository cabFareRepository;
	
	public String storeCabFareInfo(CabFare cb) {
		try {
		cabFareRepository.findSourceAndDestination(cb.getSource(), cb.getDestination());
		return "Alreay information present";
		}catch(Exception e) {
			System.err.println(e);
			cabFareRepository.save(cb);
			return "Car Fare Information stored";
		}
		
	}
	
	public float findFare(String source, String destination) {
		try {
			return cabFareRepository.findFare(source, destination);
		} catch (Exception e) {
			System.err.println(e);
			return -1;
		}
	}
}
