package com.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cabfare")
public class CabFare {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int srno;
private String source;
private String destination;
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
