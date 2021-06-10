package com.TPH;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="TypeOfEmployee",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="Employee")
public class Employee {
	@Id
	@Column(name="EmployeeId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eId;
	
	@Column
	private String eName;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}
	
	
	
}
