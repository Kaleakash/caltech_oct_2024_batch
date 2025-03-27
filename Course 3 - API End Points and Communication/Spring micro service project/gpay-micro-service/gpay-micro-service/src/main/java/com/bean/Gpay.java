package com.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gpay {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)		// auto increment 
private int gpayid;
private String emailid;
private int accnum;
public int getGpayid() {
	return gpayid;
}
public void setGpayid(int gpayid) {
	this.gpayid = gpayid;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public int getAccnum() {
	return accnum;
}
public void setAccnum(int accnum) {
	this.accnum = accnum;
}

}
