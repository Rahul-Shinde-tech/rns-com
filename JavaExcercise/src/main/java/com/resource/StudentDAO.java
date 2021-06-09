package com.resource;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import javassist.bytecode.Descriptor.Iterator;

public class StudentDAO {
	public static void saveStudent(Student s) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();

	}

	public static List<Student> getStudentList() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		List<Student> studList = null;
		try {

			String qry = "from Student";
			Query query = session.createQuery(qry);
			studList=query.list();

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			session.getTransaction().commit();
			session.close();
		}
		return studList;
	}
	
	//Use of Get()
	public static void getMethod(int sid) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		Student stud=(Student)session.get(Student.class,sid);
		System.out.println(stud);
		
		session.getTransaction().commit();
		session.close();
		
	}
	//Using Load Method 
	public static void loadMethod(int sid) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		/*Student stud = (Student) session.load(Student.class, 2);
		System.out.println(stud);*/
		System.out.println(session.load(Student.class, 2));
		
		session.getTransaction().commit();
		session.close();
	}
}
