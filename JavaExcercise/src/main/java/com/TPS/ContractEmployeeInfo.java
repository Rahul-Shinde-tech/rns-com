package com.TPS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="EmpId")
public class ContractEmployeeInfo extends EmployeeInfo {
	@Column
	private int salPerHr;
	@Column
	private int duration;
	public int getSalPerHr() {
		return salPerHr;
	}
	public void setSalPerHr(int salPerHr) {
		this.salPerHr = salPerHr;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
