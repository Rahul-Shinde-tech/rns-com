package com.stud.resource;

public class Student {
	private int sid;
	private String fName;
	private String lName;
	private int subject1;
	private int subject2;
	private static Student std=null;
	
	static Student getStudInstance(){
		if(std==null) {
			return new Student();
		}else {
			return null;
		}
	}
		
	private Student() {
		super();
	}
	public Student(int sid, String fName, String lName, int subject1, int subject2) {
		super();
		this.sid = sid;
		this.fName = fName;
		this.lName = lName;
		this.subject1 = subject1;
		this.subject2 = subject2;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fName=" + fName + ", lName=" + lName + ", subject1=" + subject1
				+ ", subject2=" + subject2 + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getSubject1() {
		return subject1;
	}
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}
	public int getSubject2() {
		return subject2;
	}
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}
	
}
