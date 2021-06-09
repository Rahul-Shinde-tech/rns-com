package com.ManyToOne;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.embeddeding.HibernateUtil;

public class TestMain {
	public static void main(String[] args) {
	/*	Question q1 = new Question();
		q1.setqId(1);
		q1.setQuestion("What is Java :");
		
		Answer ans1 = new Answer();
		ans1.setaId(11);
		ans1.setAnswer("Java is Programing Langauge:");
		ans1.setQuestion(q1);
		
		Answer ans2 = new Answer();
		ans2.setaId(22);
		ans2.setAnswer("Java is Platform Independent");
		ans2.setQuestion(q1);
		
		
		Answer ans3 = new Answer();
		ans3.setaId(33);
		ans3.setAnswer("Java is portable :");
		ans3.setQuestion(q1);
		
		
		List<Answer> list = new ArrayList<>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		q1.setAnswer(list);*/
		
		Session session =HibernateUtil.getSession();
		session.beginTransaction();
		/*session.save(q1);
		session.save(ans1);
		session.save(ans2);
		session.save(ans3);*/
		Question question =(Question) session.get(Question.class, 1);
		System.out.println(question.getQuestion());
		
		for(Answer ans:question.getAnswer()) {
			System.out.println(ans.getAnswer());
		}
		
		session.getTransaction().commit();
		session.clear();
		
	}
	
}
