package org.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory =null;
	private static Session retSession=null;
	
	static {
		try{
			loadSessionFactory();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static SessionFactory loadSessionFactory(){
		SessionFactory factory=null;
		Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		configure.addAnnotatedClass(org.test.GameTable.class);
		StandardServiceRegistry builder = new StandardServiceRegistryBuilder().applySettings(configure.getProperties()).build();
		factory = configure.buildSessionFactory(builder);
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

