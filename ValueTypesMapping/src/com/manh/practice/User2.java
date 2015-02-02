package com.manh.practice;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;


//@Entity(name="USER_DETAILS")
public class User2 {
String name;
//@Id
int id;
//@Embedded
Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

}
