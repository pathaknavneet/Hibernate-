package com.manh.practice;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Car audi=new Audi();
		audi.setName("name1");
		audi.setPrice(100);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
        Transaction  tr=s.beginTransaction();
        s.save(audi);
        tr.commit();
        s.close();
		
		

	}

}
