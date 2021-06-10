package com.TPS;

import org.hibernate.Session;

public class TestMain {
	public static void main(String[] args) {
		EmployeeInfo emp = new EmployeeInfo();
		emp.seteName("Sachin");
		
		RegularEmployeeInfo remp = new RegularEmployeeInfo();
		remp.seteName("Virat");
		remp.setBonus(2000);
		remp.setSalary(20000);
		
		ContractEmployeeInfo cemp = new ContractEmployeeInfo();
		cemp.seteName("Sourav");
		cemp.setDuration(12);
		cemp.setSalPerHr(10);
		
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(emp);
		session.save(remp);
		session.save(cemp);
		
		session.getTransaction().commit();
		session.close();
	}
}
