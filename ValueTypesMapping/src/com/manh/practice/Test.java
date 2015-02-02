package com.manh.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Address address=new Address();
		address.setCity("new delhi");
		address.setState("Delhi");
		address.setPin("110044");
		User2 u2=new User2();
		u2.setId(1);
		u2.setName("navneet");
		u2.setAddress(address);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(u2);
		s.getTransaction().commit();
		s.close();
		
		
	}

}
