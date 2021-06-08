package org.rns;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.rns.HibernateUtil;

public class HibernateUtil {
	private static SessionFactory factory =null;
	private static Session retSession=null;
	
	public static SessionFactory loadSessionFactory(){
		Configuration configure = new Configuration().configure();
		factory = configure.buildSessionFactory();
		return factory;
	}
	
	public static Session getSession() throws HibernateException{
		try {
			factory=HibernateUtil.loadSessionFactory();
			retSession = factory.openSession();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return retSession;
	}
}
