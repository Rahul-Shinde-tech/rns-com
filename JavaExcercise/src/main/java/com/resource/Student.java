package com.resource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sId;
	@Column
	private String sName;
	
	
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}
	public Student(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	public Student() {
		super();
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
}
