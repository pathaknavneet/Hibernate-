package com.manh.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {

	Person3 p3=new Person3("nishant","killer");
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	s.beginTransaction();
    s.save(p3);
	
	s.getTransaction().commit();
	s.close();
	
	
	
	
}	
}
