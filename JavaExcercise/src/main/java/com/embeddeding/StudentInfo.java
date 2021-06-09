package com.embeddeding;

public class StudentInfo {
	private int sId;
	private String sName;
	private String sDept;
	private boolean sTalk;
	
	public StudentInfo(int sId, String sName, String sDept, boolean sTalk) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sDept = sDept;
		this.sTalk = sTalk;
	}
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sDept=" + sDept + ", sTalk=" + sTalk + "]";
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
	public String getsDept() {
		return sDept;
	}
	public void setsDept(String sDept) {
		this.sDept = sDept;
	}
	public boolean issTalk() {
		return sTalk;
	}
	public void setsTalk(boolean sTalk) {
		this.sTalk = sTalk;
	}
}
