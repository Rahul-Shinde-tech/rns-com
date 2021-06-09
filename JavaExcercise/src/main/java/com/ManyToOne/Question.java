package com.ManyToOne;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	private int qId;
	@Column
	private String question;
	
	@OneToMany(mappedBy="question")
	private List<Answer> answer;
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qId, String question, List<Answer> answer) {
		super();
		this.qId = qId;
		this.question = question;
		this.answer = answer;
	}
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
}
