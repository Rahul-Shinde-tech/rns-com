package com.ManyTo.Many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
	static SessionFactory factory =null;
	static Session session = null;
	
	public static Session getSession() {
		try {
			Configuration config = new Configuration().configure();
			factory= config.buildSessionFactory();
			return session = factory.openSession();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return session;
	}
}
