package com.embeddeding;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column
	private int pincode;
	@Column
	private String streeName;

	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pincode, String streeName) {
		super();
		this.pincode = pincode;
		this.streeName = streeName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getStreeName() {
		return streeName;
	}
	public void setStreeName(String streeName) {
		this.streeName = streeName;
	}

}
