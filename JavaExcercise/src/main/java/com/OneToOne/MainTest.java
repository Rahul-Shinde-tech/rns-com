package com.OneToOne;

import org.hibernate.Session;

public class MainTest {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Question q1 = new Question();
		q1.setqId(1);
		q1.setQuestion("What is Java ?");
		Answer ans1 = new Answer();
		ans1.setaId(11);
		ans1.setAnswer("Java is a Programing Language");
		//ans1.setQuestion(q1);
		q1.setAnswer(ans1);
		
		Question q2 = new Question();
		q2.setqId(2);
		q2.setQuestion("What is collection ");
		Answer ans2 = new Answer();
		ans2.setaId(22);
		ans2.setAnswer("group of Individual Objects");
		//ans2.setQuestion(q2);
		q2.setAnswer(ans2);
		
		//SessionFactory factory = HibernateUtil.getSessionFactory();
	
		session.beginTransaction();
		
		session.save(q1);
		session.save(q2);
		session.save(ans1);
		session.save(ans2);
		
		session.getTransaction().commit();
		
		Question que = (Question) session.get(Question.class, 1);
		System.out.println(que.getQuestion());
		System.out.println(que.getAnswer().getAnswer());
		
		/*Answer ans = (Answer) session.get(Answer.class, 11);
		System.out.println(ans.getAnswer());
		//System.out.println(ans.getQuestion().getQuestion());*/
		session.close();
		/*Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(q1);
		//session.save(q2);
		//session.getTransaction().commit();
		session.close();*/

	}

}
