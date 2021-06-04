package com.main;

import org.hibernate.Session;

public class JavaQAMain {
	public static void main(String[] args) {
		try {
			
			Session session =HibernateUtil.getSession();
			
			Question q1 = new Question();
			q1.setQuestionId(144);
			q1.setQuestion("What is java?");
			Answer answer = new Answer();
			answer.setAnswerId(344);
			answer.setAnswer("Java is Object Oriented Language:");
			q1.setAnswer(answer);
			session.beginTransaction();
			session.save(answer);  
			session.save(q1);
			 
			session.getTransaction().commit();
			//HibernateUtil.getConnection().close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
