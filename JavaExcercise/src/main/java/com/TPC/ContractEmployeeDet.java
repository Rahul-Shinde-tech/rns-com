package com.TPC;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
	@AttributeOverride(name="EmployeeId", column=@Column(name="EmployeeId")),
	@AttributeOverride(name="EmployeeName", column=@Column(name="EmployeeName"))
})
public class ContractEmployeeDet extends EmployeeDetails {
	@Column(name="SalaryPerHour")
	private int salPerHour;
	@Column(name="ContractPeriod")
	private int contractPer;
	public int getSalPerHour() {
		return salPerHour;
	}
	public void setSalPerHour(int salPerHour) {
		this.salPerHour = salPerHour;
	}
	public int getContractPer() {
		return contractPer;
	}
	public void setContractPer(int contractPer) {
		this.contractPer = contractPer;
	}
	
	
	
}
