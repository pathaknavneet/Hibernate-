package com.manh.practice;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	     Employee emp=new Employee();
         emp.setDepartmentName("PSO");
         emp.setFirstName("navneet");
         emp.setLastName("pathak");
         emp.setJoiningDate(new Date());
         Person p=new Person();
         p.setFirstName("nikhil");
         p.setLastName("sinha");
         
		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.save(emp);
		s.save(p);
		s.getTransaction().commit();
		s.close();

	}

}
