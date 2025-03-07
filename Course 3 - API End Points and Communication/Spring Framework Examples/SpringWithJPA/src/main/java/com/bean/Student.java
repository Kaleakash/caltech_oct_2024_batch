package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope("prototype")
public class Student {
@Id
private int sid;
private String name;
private int age;
private Integer tid; // it can hold null value because it map to foreign key column 
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Integer getTid() {
	return tid;
}
public void setTid(Integer tid) {
	this.tid = tid;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", tid=" + tid + "]";
}

}
