package com.ManyTo.Many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeDesc")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EmployeeId")
	private int employeeId;
	
	@Column(name="EmployeeName")
	private String employeeName;
	
	@ManyToMany
	@JoinTable(name="EmployeeToProject",
	joinColumns= {@JoinColumn(name="EmpId")},
	inverseJoinColumns= {@JoinColumn(name="PrjId")})
	private List<Project> project;
	
	
	
	public Employee(int employeeId, String employeeName, List<Project> project) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.project = project;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	
	
	
}
