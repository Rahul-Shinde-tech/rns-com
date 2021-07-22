package com.rns.javabasedconfig;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {

	JdbcTemplate jdbcTemplate;
	
	public int saveStudent(Student student) {
		//String query = "insert into student(studentId,studentName,addreess) values(?,?,?)";
		String query = "insert into student(studentid,studentname,addreess) values(?,?,?)";
		int result = jdbcTemplate.update(query,student.getStudentId(),student.getStudentName(),student.getAddreess());
		return result;
	}

	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public StudentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
