package com.manh.practice;

import java.util.Date;

public class Employee2 extends Person2{
private Date joiningDate;
private String departmentname;
public Date getJoiningDate() {
	return joiningDate;
}
public void setJoiningDate(Date joiningDate) {
	this.joiningDate = joiningDate;
}
public String getDepartmentname() {
	return departmentname;
}
public void setDepartmentname(String departmentname) {
	this.departmentname = departmentname;
}
public Employee2(String firstName,String lastName,Date joiningDate,String departmentName)
{
	super(firstName,lastName);
	this.joiningDate=joiningDate;
	this.departmentname=departmentName;
}
}
