package com.resourece;

public class Student {
	private int sId;
	private String sName;
	private String lName;

	public Student() {
		super();
	}
	
	public Student(int sId, String sName, String lName) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.lName = lName;
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
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
}
