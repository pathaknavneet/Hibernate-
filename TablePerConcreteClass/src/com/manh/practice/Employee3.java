package com.manh.practice;

import java.util.Date;

public class Employee3 extends Person3{
private Date joining_date;
private String department_name;
public Date getJoining_date() {
	return joining_date;
}
public void setJoining_date(Date joining_date) {
	this.joining_date = joining_date;
}
public String getDepartment_name() {
	return department_name;
}
public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}

public Employee3(String firstName,String lastName,Date joiningDate,String departmentName)
{
	
	super(firstName,lastName);
	this.joining_date=joiningDate;
	this.department_name=departmentName;
	
}

}
