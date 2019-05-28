package com.nt.person;

public class Animal {
private int aid;
private String aname;
private String type;
public Animal() {
	// TODO Auto-generated constructor stub
}
public Animal(int aid, String type) {
	super();
	this.aid = aid;
	this.type = type;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Animal [aid=" + aid + ", aname=" + aname + ", type=" + type + "]";
}

}
