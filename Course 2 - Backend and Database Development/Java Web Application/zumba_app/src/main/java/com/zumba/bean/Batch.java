package com.zumba.bean;

public class Batch {
private int bid;
private String typeofbatch;
private String time;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getTypeofbatch() {
	return typeofbatch;
}
public void setTypeofbatch(String typeofbatch) {
	this.typeofbatch = typeofbatch;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public Batch() {
	super();
	// TODO Auto-generated constructor stub
}
public Batch(int bid, String typeofbatch, String time) {
	super();
	this.bid = bid;
	this.typeofbatch = typeofbatch;
	this.time = time;
}

}
