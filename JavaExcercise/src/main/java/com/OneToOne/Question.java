package com.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int qId;
	@Column
	private String question;
	@OneToOne
	private Answer answer;

	
	@Override
	public String toString() {
		return "Question [qId=" + qId + ", question=" + question + ", answer=" + answer + "]";
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qId, String question, Answer answer) {
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
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
}
