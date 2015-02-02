package com.manh.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Item item = new Item();
		item.setItem_id(1);
		item.setName("item1");
		item.setType("purse");
		Bid bid = new Bid();
		bid.setBid_price(2000l);
		bid.setBidder_name("navneet");
		bid.setId(1);
		Bid bid1 = new Bid();
		bid1.setBid_price(2000l);
		bid1.setBidder_name("navneet");
		bid1.setId(2);
		bid1.setItem(item);

		item.addBid(bid);
		item.addBid(bid1);

		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.save(bid1);
		s.save(bid);
		s.save(item);
		s.getTransaction().commit();
		s.close();

	}

}
