package com.manh.practice;

public class Person2 {

	private Long personId;
	private String firstName;
	private String lastName;
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
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
	
	public Person2(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
}
