package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.CabFare;
import com.service.CabFareService;

@RestController
@RequestMapping("cabfare")    // http://localhost:8282/cabfare/*
public class CabFareController {

	@Autowired
	CabFareService cabFareService;
	// http://localhost:8282/cabfare/create
	
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCabFareInfo(@RequestBody CabFare cabFare) {
		return cabFareService.storeCabFareInfo(cabFare);
	}
	
	// http://localhost:8282/cabfare/findFare/A/B
	
	@GetMapping(value = "findFare/{source}/{destination}")
	public float findCabFare(@PathVariable String source, @PathVariable String destination) {
		System.out.println(source +" "+destination);
		return cabFareService.findFare(source, destination);
	}
}
