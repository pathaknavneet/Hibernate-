package com.manh.practice;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 Employee2 emp=new Employee2("navneet","pathak",new Date(),"pso");
		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.save(emp);
		Owner owner=new Owner("nishant","sinha",100l,100l);
		s.save(owner);
		s.getTransaction().commit();
		s.close();

	}

}
