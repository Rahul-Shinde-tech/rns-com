package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory getConnection(){
		Configuration configure = new Configuration().configure();
		configure.addAnnotatedClass(Question.class);
		configure.addAnnotatedClass(Answer.class);
		StandardServiceRegistry builder = new StandardServiceRegistryBuilder().applySettings(configure.getProperties()).build();
		
		return configure.buildSessionFactory(builder);
	}
	public static Session getSession() {
		return getConnection().openSession();
	}
}
