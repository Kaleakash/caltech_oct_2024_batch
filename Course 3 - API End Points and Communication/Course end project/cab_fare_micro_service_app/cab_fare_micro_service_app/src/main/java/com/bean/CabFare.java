package com.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cabfare")	// create the table with name as cabfare not cab_fare
public class CabFare {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	// auto increment 
@Column(name="srno")
private int srno;
@Column(name="source")			// srno, typeofcab, price, source, destination,
private String source;
@Column(name="destination")
private String destination;
@Column(name="fare")
private float fare;
public int getSrno() {
	return srno;
}
public void setSrno(int srno) {
	this.srno = srno;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public float getFare() {
	return fare;
}
public void setFare(float fare) {
	this.fare = fare;
}

}
