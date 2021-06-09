package com.embeddeding;

import org.hibernate.Session;

public class StudentDAO {
	static Session session = null;
	public static void saveInfo(Student s) {
		session= HibernateUtil.getSession();
		session.beginTransaction();
		session.save(s);
		
		
		session.getTransaction().commit();
		session.close();
	}
}
