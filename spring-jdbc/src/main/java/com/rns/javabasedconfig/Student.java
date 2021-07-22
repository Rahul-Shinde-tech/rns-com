package com.rns.javabasedconfig;


public class Student  {
	
	private int studentId;
	private String studentName;
	private String addreess;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddreess() {
		return addreess;
	}
	public void setAddreess(String addreess) {
		this.addreess = addreess;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String addreess) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.addreess = addreess;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", addreess=" + addreess + "]";
	}
	
}
