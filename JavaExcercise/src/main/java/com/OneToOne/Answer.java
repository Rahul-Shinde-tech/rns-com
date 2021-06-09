package com.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int aId;
	@Column
	private String answer;
	
	/*@OneToOne
	private Question question;
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}*/
	
	@Override
	public String toString() {
		return "Answer [aId=" + aId + ", answer=" + answer + "]";
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int aId, String answer) {
		super();
		this.aId = aId;
		this.answer = answer;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
