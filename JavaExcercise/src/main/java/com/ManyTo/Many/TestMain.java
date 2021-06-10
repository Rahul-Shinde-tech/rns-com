package com.ManyTo.Many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class TestMain {
	public static void main(String[] args) {
		// Settings the Objects 
		
		Employee emp1 = new Employee();
		emp1.setEmployeeName("Sachin");
		
		Employee emp2 = new Employee();
		emp2.setEmployeeName("Ricky");
		
		Project prj1 = new Project();
		prj1.setProjectName("Online Treds");
		
		Project prj2 = new Project();
		prj2.setProjectName("Gaming Application");
		
		Project prj3 = new Project();
		prj3.setProjectName("Web Application");
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		List<Employee> empList1 = new ArrayList<>();
		empList1.add(emp2);
		
		List<Project> prjList= new ArrayList<>();
		prjList.add(prj1);
		prjList.add(prj2);
		
		List<Project> prjList1 = new ArrayList<>();
		prjList1.add(prj3);
		
		emp1.setProject(prjList);
		prj1.setEmployee(empList);
		prj2.setEmployee(empList);
		
		emp2.setProject(prjList1);
		prj3.setEmployee(empList1);
		
		
		Session session = Hibernateutil.getSession();
		session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(prj1);
		session.save(prj2);
		session.save(prj3);
		
		session.getTransaction().commit();
		session.close();
	}
}
