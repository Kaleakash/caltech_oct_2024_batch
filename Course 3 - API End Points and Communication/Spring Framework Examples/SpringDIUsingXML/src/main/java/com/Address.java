package com;

public class Address {
private String city;
private String state;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
// toString method is object display in string format. 
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}



}
