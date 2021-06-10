package com.TPC;

import org.hibernate.Session;

public class TestMain {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		
		EmployeeDetails emp = new EmployeeDetails();
		emp.seteName("Sachin");
		
		ContractEmployeeDet cemp = new ContractEmployeeDet();
		cemp.seteName("Virat");
		cemp.setSalPerHour(2000);
		cemp.setContractPer(48);
		
		RegularEmployeeDet remp = new RegularEmployeeDet();
		remp.seteName("virender");
		remp.setSalary(20000);
		remp.setBonus(2000);
		
		session.beginTransaction();
		session.save(emp);
		session.save(cemp);
		session.save(remp);
		
		
		session.getTransaction().commit();
		session.close();
	}
}
