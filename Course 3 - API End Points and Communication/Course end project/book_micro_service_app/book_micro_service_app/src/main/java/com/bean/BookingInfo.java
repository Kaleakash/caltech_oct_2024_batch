package com.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookinginfo")
public class BookingInfo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "bookingid")			// to avoid _ separated symbol with 2 words. 
private int bookingId;
@Column(name = "customerName")
private String customerName;
private String source;
private String destination;
private float price;				// we get the price from cab_fare micro service 
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
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
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "BookingInfo [bookingId=" + bookingId + ", customerName=" + customerName + ", source=" + source
			+ ", destination=" + destination + ", price=" + price + "]";
}

}
