package com.embeddeding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="StudentInfo")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sId;
	@Column
	private String sName;
	@Column
	private String sDept;
	@Column
	@Transient
	private boolean sTalk;
	@Column
	private Address address;
	
	public Student(int sId, String sName, String sDept, boolean sTalk, Address address) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sDept = sDept;
		this.sTalk = sTalk;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(int sId, String sName, String sDept, boolean sTalk) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sDept = sDept;
		this.sTalk = sTalk;
	}
	public Student() {
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
