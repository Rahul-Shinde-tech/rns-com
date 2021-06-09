package com.ManyToOne;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	private int aId;
	@Column
	private String answer;
	
	@ManyToOne
	private Question question;
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int aId, String answer, Question question) {
		super();
		this.aId = aId;
		this.answer = answer;
		this.question = question;
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
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
}
