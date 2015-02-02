package com.manh.practice;

public class Person3 {
int person_id;
String firstName;
String lastName;
public Person3(String firstName,String lastName)
{
	
	this.firstName=firstName;
	this.lastName=lastName;
}
public int getPerson_id() {
	return person_id;
}
public void setPerson_id(int person_id) {
	this.person_id = person_id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}


}
