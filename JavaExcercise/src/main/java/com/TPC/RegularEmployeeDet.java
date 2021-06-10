package com.TPC;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
	@AttributeOverride(name="EmployeeId",column=@Column(name="EmployeeId")),
	@AttributeOverride(name="EmployeeName", column=@Column(name="EmployeeName"))
})
public class RegularEmployeeDet extends EmployeeDetails{
	@Column
	private int salary;
	@Column
	private int bonus;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
