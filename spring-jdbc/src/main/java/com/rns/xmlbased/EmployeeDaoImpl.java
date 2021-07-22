package com.rns.xmlbased;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao{
	JdbcTemplate jdbcTemplate;
	
	public int saveEmployee(Employee employee) {
		String query="insert into Employee(id,name,address) values(?,?,?)";
		int res= this.jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getAddress());
		
		return res;
	}

	public JdbcTemplate getTemplate() {
		return jdbcTemplate;
	}

	public void setTemplate(JdbcTemplate template) {
		this.jdbcTemplate= template;
	}

	public EmployeeDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDaoImpl(JdbcTemplate template) {
		super();
		this.jdbcTemplate = template;
	}
	
	
}

