package com.resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static SessionFactory factory = null;
	public static Session session = null;
	public static SessionFactory getSessionFactory() {
		try {
			Configuration config = new Configuration().configure();
			factory = config.buildSessionFactory();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return factory;
	}
	public static Session getSession() {
		try {
			session = getSessionFactory().openSession();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return session;
	}
}
