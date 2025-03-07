package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Entity
@Component
@Scope("prototype")
public class Trainer {
@Id
private int tid;
private String tname;
private String tech;
@OneToMany
@JoinColumn(name = "tid")			// Link to FK in Student table 
private List<Student> listOfStudent;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public List<Student> getListOfStudent() {
	return listOfStudent;
}
public void setListOfStudent(List<Student> listOfStudent) {
	this.listOfStudent = listOfStudent;
}
@Override
public String toString() {
	return "Trainer [tid=" + tid + ", tname=" + tname + ", tech=" + tech + ", listOfStudent=" + listOfStudent + "]";
}

}
