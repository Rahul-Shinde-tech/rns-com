package com.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibenateUtil {
	static SessionFactory factory = null;
	static Session session =null;
	public static SessionFactory getSessionfactory(){
		try{
			Configuration config = new Configuration().configure();
			factory=config.buildSessionFactory();
		}
		catch (Exception e) {
				e.printStackTrace();
		}
		return factory;
	}
	public static Session getSession() {
		try {
			session=getSessionfactory().openSession();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return session;
	}
}
