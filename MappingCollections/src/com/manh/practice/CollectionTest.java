package com.manh.practice;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CollectionTest {


	public static void main(String[] args) {

		
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	s.beginTransaction();
	Set<String> contact_number_Set=new HashSet<String>();
	contact_number_Set.add(new String("76352827654"));
	contact_number_Set.add(new String("76352827644"));
	contact_number_Set.add(new String("76352827837"));
	contact_number_Set.add(new String("76352822527"));
	Staff staff=new Staff();
	staff.setContact_numbers(contact_number_Set);
	staff.setName("navneet");
	s.save(staff);
	s.getTransaction().commit();
	s.close();
	
	
	}

}
